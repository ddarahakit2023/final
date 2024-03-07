package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.common.BaseResponse;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public BaseResponse<PostCourseRes> createCourse(@RequestBody PostCourseReq request) {

        if (request.getName() == null) {
            return new BaseResponse<>(POST_COURSE_EMPTY_NAME);
        }
        if (request.getPrice() == null) {
            return new BaseResponse<>(POST_COURSE_EMPTY_PRICE);
        }
        if (request.getDescription() == null) {
            return new BaseResponse<>(POST_COURSE_EMPTY_DESCRIPTION);
        }

        try {
            PostCourseRes response = courseService.createCourse(request);
            return new BaseResponse<>(response);
        } catch (BaseException exception) {
            return new BaseResponse<>(exception.getStatus());
        }
    }


    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public BaseResponse<List<GetCourseRes>> listCourse() {
        try {
            List<GetCourseRes> getProductResList = courseService.listCourse();
            return new BaseResponse<>(getProductResList);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public BaseResponse<GetCourseRes> readCourse(@PathVariable Long id) {
        try {
            GetCourseRes getCourseRes = courseService.readCourse(id);
            return new BaseResponse<>(getCourseRes);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }
}
