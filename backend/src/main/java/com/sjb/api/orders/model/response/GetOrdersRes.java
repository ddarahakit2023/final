package com.sjb.api.orders.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetOrdersRes {
    private String impUid;
    private Long courseId;
}
