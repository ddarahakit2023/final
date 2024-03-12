package com.sjb.api.orders;

import com.siot.IamportRestClient.exception.IamportResponseException;
import com.sjb.api.common.BaseException;
import com.sjb.api.common.BaseResponse;
import com.sjb.api.member.model.Member;
import com.sjb.api.member.model.response.PostLoginRes;
import com.sjb.api.orders.model.response.GetOrdersRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static com.sjb.api.common.BaseResponseStatus.*;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
public class OrdersController {
    private final OrdersService ordersService;
    @RequestMapping("/validation")
    public BaseResponse<GetOrdersRes> validation(@AuthenticationPrincipal Member member, String impUid) {
        try {
            GetOrdersRes response = ordersService.paymentValidation(member, impUid);
            return new BaseResponse<>(response);
        } catch(BaseException exception) {
            return new BaseResponse<>(exception.getStatus());
        } catch (IamportResponseException iamportResponseException) {
            return new BaseResponse<>(IAMPORT_ERROR);
        } catch (IOException exception) {
            return new BaseResponse<>(IAMPORT_ERROR);
        }
    }
}
