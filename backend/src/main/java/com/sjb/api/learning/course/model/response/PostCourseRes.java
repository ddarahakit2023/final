package com.sjb.api.learning.course.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PostCourseRes {

    private Long id;

    private String name;

    private String description;

    private Integer price;
}
