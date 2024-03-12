package com.sjb.api.orders;

import com.siot.IamportRestClient.IamportClient;
import com.siot.IamportRestClient.exception.IamportResponseException;
import com.siot.IamportRestClient.response.IamportResponse;
import com.siot.IamportRestClient.response.Payment;
import com.sjb.api.common.BaseException;
import com.sjb.api.learning.course.CourseService;
import com.sjb.api.learning.course.model.Course;
import com.sjb.api.member.model.Member;
import com.sjb.api.orders.model.Orders;
import com.sjb.api.orders.model.response.GetOrdersRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.Optional;

import static com.sjb.api.common.BaseResponseStatus.COURSE_NULL;
import static com.sjb.api.common.BaseResponseStatus.ORDERS_VALIDATION_FAIL;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final IamportClient iamportClient;
    private final CourseService courseService;
    private final OrdersRepository ordersRepository;

    public GetOrdersRes paymentValidation(Member member, String impUid) throws BaseException, IamportResponseException, IOException {
        IamportResponse<Payment> response = iamportClient.paymentByImpUid(impUid);
        Integer amount = response.getResponse().getAmount().intValue();

        Long courseId = Long.parseLong(response.getResponse().getMerchantUid().split("_")[1]);
        Integer price = courseService.getCoursePrice(courseId);

        if(amount.equals(price) ) {
            // 결제 내역 저장
            Orders orders = Orders.builder()
                    .impUid(impUid)
                    .member(member)
                    .course(Course.builder().id(courseId).build())
                    .build();
            ordersRepository.save(orders);

            return GetOrdersRes.builder().impUid(impUid).courseId(courseId).build();
        } else {
            throw new BaseException(ORDERS_VALIDATION_FAIL);
        }
    }

    public Boolean checkOrdered(Member member, Long courseId) {
        Optional<Orders> result = ordersRepository.findByMemberAndCourse(member, Course.builder().id(courseId).build());

        if (result.isPresent()) {
            return true;
        }
        return false;
    }
}
