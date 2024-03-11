package com.sjb.api.learning.course;

import com.sjb.api.learning.course.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

}
