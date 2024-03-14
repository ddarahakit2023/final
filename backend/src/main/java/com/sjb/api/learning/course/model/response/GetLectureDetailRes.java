package com.sjb.api.learning.course.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class GetLectureDetailRes {
    private Long id;
    private String courseName;
    private String lectureName;
    private String videoUrl;
    private Integer totalPlayTime;
    private Integer totalLectureCount;
    List<GetSectionRes> sections;
}
