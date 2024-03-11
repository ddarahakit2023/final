package com.sjb.api.learning.course;

import com.amazonaws.services.s3.AmazonS3;
import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseDetailRes;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import com.sjb.api.member.MemberService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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

    @Mock
    private AmazonS3 s3;

    @InjectMocks
    private CourseService courseService;

    private static Course course;
    private static PostCourseReq request;
    private static MockMultipartFile image;
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

        image = new MockMultipartFile("file", "test.png", "text/plain", "test file".getBytes(StandardCharsets.UTF_8));

    }

    @Test
    void courseService_createCourse_success_with_image() throws MalformedURLException {
        // given
        ReflectionTestUtils.setField(courseService, "bucket", "ddarahakit2023-s3");
        given(courseRepository.save(any(Course.class))).willReturn(course);
        given(s3.getUrl(any(String.class), any(String.class))).willReturn(new URL("https://ddarahakit2023-s3.s3.ap-northeast-2.amazonaws.com/2024/03/08/9cf04deb-38cc-4f09-ae2f-1aa14665f643_test.png"));
        // when
        PostCourseRes response;
        try {
            response = courseService.createCourse(image, request);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getId());
        assertEquals(request.getName(),  response.getName());
    }

    @Test
    void courseService_createCourse_success_without_image() {
        // given
        ReflectionTestUtils.setField(courseService, "bucket", "ddarahakit2023-s3");
        given(courseRepository.save(any(Course.class))).willReturn(course);

        // when
        PostCourseRes response;
        try {
            response = courseService.createCourse(null, request);
        } catch (BaseException e) {
            throw new RuntimeException(e);
        }

        // then
        assertNotNull(response.getId());
        assertEquals(request.getName(),  response.getName());
    }

    @Test
    void courseService_createCourse_fail_pre_exist_name() {
        // given
        given(courseRepository.existsByName("리눅스 기초")).willReturn(true);

        // when
        BaseException exception = assertThrows(BaseException.class, () -> {
            courseService.createCourse(image, request);
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
        GetCourseDetailRes response;
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