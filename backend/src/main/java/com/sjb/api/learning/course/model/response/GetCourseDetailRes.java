package com.sjb.api.learning.course.model.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class GetCourseDetailRes {
    private Long id;
    private String name;
    private String image;
    private String description;
    private Integer price;
    private Boolean ordered;
    List<GetSectionRes> sections;
}
