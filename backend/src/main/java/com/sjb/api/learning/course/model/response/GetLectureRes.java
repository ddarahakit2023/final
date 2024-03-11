package com.sjb.api.learning.course.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetLectureRes {
    private Long id;
    private String name;
    private Integer playTime;
    private String videoUrl;
}
