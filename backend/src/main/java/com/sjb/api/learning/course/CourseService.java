package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public PostCourseRes createCourse(PostCourseReq request) throws BaseException {

        if(courseRepository.existsByName(request.getName())) {
            throw new BaseException(POST_COURSE_PRE_EXIST_NAME);
        }

        Course course = Course.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();

        course = courseRepository.save(course);


        return PostCourseRes.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .price(course.getPrice())
                .build();
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
                    .description(course.getDescription())
                    .price(course.getPrice())
                    .build();

            getCourseResList.add(getCourseRes);
        }
        return getCourseResList;
    }


    public GetCourseRes readCourse(Long id) throws BaseException {
        Course course = courseRepository.findById(id).orElseThrow(() -> new BaseException(COURSE_NULL));

        GetCourseRes getCourseRes = GetCourseRes.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .price(course.getPrice())
                .build();
        return getCourseRes;
    }
}