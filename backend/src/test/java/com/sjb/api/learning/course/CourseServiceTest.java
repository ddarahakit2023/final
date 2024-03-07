package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.sjb.api.common.BaseResponseStatus.POST_COURSE_PRE_EXIST_NAME;
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
    private static PostCourseRes response;
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
}