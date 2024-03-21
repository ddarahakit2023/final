package com.sjb.api.learning.course;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.Lecture;
import com.sjb.api.learning.course.model.Section;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.request.PostLectureReq;
import com.sjb.api.learning.course.model.request.PostSectionReq;
import com.sjb.api.learning.course.model.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final SectionRepository sectionRepository;
    private final LectureRepository lectureRepository;

    private final AmazonS3 s3;
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    @Transactional
    public PostCourseRes createCourse(MultipartFile image, PostCourseReq request) throws BaseException {

        if(courseRepository.existsByName(request.getName())) {
            throw new BaseException(POST_COURSE_PRE_EXIST_NAME);
        }

        String imageUrl = null;
        if (image != null) {
            imageUrl = uploadImage(image);
        }


        Course course = Course.builder()
                .name(request.getName())
                .image(imageUrl)
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        course = courseRepository.save(course);

        if (request.getSections() != null) {
            for (PostSectionReq postSectionReq : request.getSections()) {
                Section section = Section.builder()
                        .name(postSectionReq.getName())
                        .course(course)
                        .build();
                sectionRepository.save(section);
                if (postSectionReq.getLectures() != null) {
                    for (PostLectureReq postLectureReq : postSectionReq.getLectures()) {
                        Lecture lecture = Lecture.builder()
                                .name(postLectureReq.getName())
                                .playTime(postLectureReq.getPlayTime())
                                .videoUrl(postLectureReq.getVideoUrl())
                                .section(section)
                                .build();
                        lectureRepository.save(lecture);
                    }
                }

            }
        }

        return PostCourseRes.builder()
                .id(course.getId())
                .name(course.getName())
                .image(course.getImage())
                .description(course.getDescription())
                .price(course.getPrice())
                .build();
    }


    public String uploadImage(MultipartFile image) {
        String originalName = image.getOriginalFilename();
        String folderPath = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String uuid = UUID.randomUUID().toString();
        String saveFilePath = folderPath + "/" + uuid + "_" + originalName;

        try {
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(image.getSize());
            metadata.setContentType(image.getContentType());

            s3.putObject(bucket, saveFilePath, image.getInputStream(), metadata);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return s3.getUrl(bucket, saveFilePath).toString();
    }



    public List<GetCourseRes> listCourse() throws BaseException {
        List<Course> courseList = courseRepository.findAll();
        if (courseList.isEmpty()) {
            throw new BaseException(COURSE_LIST_NULL);
        }

        List<GetCourseRes> getCourseResList = new ArrayList<>();

        for (Course course : courseList) {
            GetCourseRes getCourseRes = GetCourseRes.builder()
                    .id(course.getId())
                    .name(course.getName())
                    .image(course.getImage())
                    .description(course.getDescription())
                    .price(course.getPrice())
                    .build();

            getCourseResList.add(getCourseRes);
        }
        return getCourseResList;
    }

    @Transactional
    public GetCourseDetailRes readCourse(Long id) throws BaseException {
        Course course = courseRepository.findById(id).orElseThrow(() -> new BaseException(COURSE_NULL));
        List<GetSectionRes> sections = new ArrayList<>();

        if(course.getSections() != null && !course.getSections().isEmpty()) {
            for (Section section : course.getSections()) {
                List<GetLectureRes> lectures = new ArrayList<>();
                for (Lecture lecture : section.getLectures()) {

                    GetLectureRes getLectureRes = GetLectureRes.builder()
                            .id(lecture.getId())
                            .name(lecture.getName())
                            .playTime(lecture.getPlayTime())
                            .videoUrl(lecture.getVideoUrl())
                            .build();
                    lectures.add(getLectureRes);
                }
                GetSectionRes getSectionRes = GetSectionRes.builder()
                        .id(section.getId())
                        .name(section.getName())
                        .lectures(lectures)
                        .build();
                sections.add(getSectionRes);
            }
        }

        GetCourseDetailRes response = GetCourseDetailRes.builder()
                .id(course.getId())
                .name(course.getName())
                .image(course.getImage())
                .description(course.getDescription())
                .price(course.getPrice())
                .sections(sections)
                .build();
        return response;
    }

    @Transactional
    public GetLectureDetailRes readLecture(Long courseId, Long lectureId) throws BaseException {
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new BaseException(COURSE_NULL));
        String lectureName = null;
        String videoUrl = null;
        List<GetSectionRes> sections = new ArrayList<>();
        Integer totalLectureCount = 0;
        Integer totalPlayTime = 0;

        for (Section section : course.getSections()) {
            List<GetLectureRes> lectures = new ArrayList<>();
            for (Lecture lecture : section.getLectures()) {
                if(lectureId.equals(lecture.getId())) {
                    lectureName = lecture.getName();
                    videoUrl = lecture.getVideoUrl();
                }
                GetLectureRes getLectureRes = GetLectureRes.builder()
                        .id(lecture.getId())
                        .name(lecture.getName())
                        .playTime(lecture.getPlayTime())
                        .videoUrl(lecture.getVideoUrl())
                        .build();
                lectures.add(getLectureRes);
                totalLectureCount++;
                totalPlayTime+= lecture.getPlayTime();
            }
            GetSectionRes getSectionRes = GetSectionRes.builder()
                    .id(section.getId())
                    .name(section.getName())
                    .lectures(lectures)
                    .build();
            sections.add(getSectionRes);
        }


        GetLectureDetailRes response = GetLectureDetailRes.builder()
                .id(course.getId())
                .courseName(course.getName())
                .lectureName(lectureName)
                .videoUrl(videoUrl)
                .totalLectureCount(totalLectureCount)
                .totalPlayTime(totalPlayTime)
                .sections(sections)
                .build();

        return response;
    }


    public Integer getCoursePrice(Long id) throws BaseException {
        Course course = courseRepository.findById(id).orElseThrow(() -> new BaseException(COURSE_NULL));

        return course.getPrice();
    }
}