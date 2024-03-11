package com.sjb.api.learning.course.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class GetCourseDetailRes {
    private Long id;
    private String name;
    private String image;
    private String description;
    private Integer price;

    List<GetSectionRes> getSectionResList;
}
