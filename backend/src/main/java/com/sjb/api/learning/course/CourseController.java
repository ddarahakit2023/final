package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.common.BaseResponse;
import com.sjb.api.learning.course.model.request.PostCourseReq;
import com.sjb.api.learning.course.model.response.GetCourseDetailRes;
import com.sjb.api.learning.course.model.response.GetCourseRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import com.sjb.api.member.model.Member;
import com.sjb.api.orders.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;
    private final OrdersService ordersService;
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public BaseResponse<PostCourseRes> createCourse(@RequestPart MultipartFile image, @RequestPart  PostCourseReq request) {

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
            PostCourseRes response = courseService.createCourse(image, request);
            return new BaseResponse<>(response);
        } catch (BaseException exception) {
            return new BaseResponse<>(exception.getStatus());
        }
    }


    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public BaseResponse<List<GetCourseRes>> listCourse() {
        try {
            List<GetCourseRes> response = courseService.listCourse();
            return new BaseResponse<>(response);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public BaseResponse<GetCourseDetailRes> readCourse(@AuthenticationPrincipal Member member, @PathVariable Long id) {
        try {
            GetCourseDetailRes response = courseService.readCourse(id);

            Boolean isOrdered = ordersService.checkOrdered(member, id);
            response.setOrdered(isOrdered);

            return new BaseResponse<>(response);
        } catch(BaseException exception) {
            return new BaseResponse<>((exception.getStatus()));
        }
    }
}
