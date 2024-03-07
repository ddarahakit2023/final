package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {
    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    private static Course course;
    private static PostCourseReq request;
    @BeforeAll
    static void setUp() {

        course = Course.builder()
                .id(1L)
                .name("리눅스 기초")
                .price(1000)
                .description("리눅스 기초 강의입니다.")
                .build();

        request = PostCourseReq.builder()
                .name("리눅스 기초")
                .price(1000)
                .description("리눅스 기초 강의입니다.")
                .build();
    }

    @Test
    void courseService_createCourse_success() {
        // given
        given(courseRepository.save(any(Course.class))).willReturn(course);

        // when
        PostCourseRes response;
        try {
            response = courseService.createCourse(request);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getId());
        assertEquals(request.getName(),  response.getName());
    }

    @Test
    void courseService_createCourse_pre_exist_name() {
        // given
        given(courseRepository.existsByName("리눅스 기초")).willReturn(true);

        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            courseService.createCourse(request);
        });

        // then
        assertEquals(POST_COURSE_PRE_EXIST_NAME, exception.getStatus());
    }

    @Test
    void courseService_listCourse_success() {
        // given
        List<Course> result = new ArrayList<>();
        result.add(course);
        given(courseRepository.findAll()).willReturn(result);
        // when
        List<GetCourseRes> response;
        try {
            response = courseService.listCourse();
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertFalse(response.isEmpty());

    }

    @Test
    void courseService_listCourse_fail_list_null() {
        // given
        List<Course> result = new ArrayList<>();
        given(courseRepository.findAll()).willReturn(result);
        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            courseService.listCourse();
        });

        // then
        assertEquals(COURSE_LIST_NULL, exception.getStatus());
    }

    @Test
    void courseService_readCourse_success() {
        // given
        given(courseRepository.findById(any(Long.class))).willReturn(Optional.of(course));
        // when
        GetCourseRes response;
        try {
            response = courseService.readCourse(1L);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertEquals(response.getId(), course.getId());
        assertEquals(response.getName(), course.getName());

    }

    @Test
    void courseService_readCourse_fail_null() {
        // given

        given(courseRepository.findById(any(Long.class))).willReturn(Optional.empty());
        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            courseService.readCourse(1L);
        });

        // then
        assertEquals(COURSE_NULL, exception.getStatus());
    }
}