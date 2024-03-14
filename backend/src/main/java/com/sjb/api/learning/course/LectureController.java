package com.sjb.api.learning.course;

import com.sjb.api.common.BaseException;
import com.sjb.api.common.BaseResponse;
import com.sjb.api.learning.course.model.Lecture;
import com.sjb.api.learning.course.model.response.GetCourseDetailRes;
import com.sjb.api.learning.course.model.response.GetLectureDetailRes;
import com.sjb.api.learning.course.model.response.GetLectureRes;
import com.sjb.api.learning.course.model.response.PostCourseRes;
import com.sjb.api.member.model.Member;
import com.sjb.api.orders.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.*;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/lecture")
public class LectureController {
    private final CourseService courseService;
    private final OrdersService ordersService;
    @RequestMapping(method = RequestMethod.GET, value = "/{courseId}/{lectureId}")
    public BaseResponse<GetLectureDetailRes> readLecture(@AuthenticationPrincipal Member member, @PathVariable Long courseId, @PathVariable Long lectureId) {
        try {
            if(ordersService.checkOrdered(member, courseId)) {
                GetLectureDetailRes response = courseService.readLecture(courseId, lectureId);
                return new BaseResponse<>(response);
            } else {
                return new BaseResponse<>(ORDERS_NOT_ORDERED);
            }
        } catch (BaseException exception) {
            return new BaseResponse<>(exception.getStatus());
        }
    }
}
