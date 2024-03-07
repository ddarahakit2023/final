package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.POST_COURSE_PRE_EXIST_NAME;

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

}