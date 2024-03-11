package com.sjb.api.learning.course.model.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class PostCourseReq {
    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    @PositiveOrZero
    private Integer price;

    private List<PostSectionReq> sections = new ArrayList<>();
}
