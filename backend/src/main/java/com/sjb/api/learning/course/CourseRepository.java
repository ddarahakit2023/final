package com.sjb.api.learning.course;

import com.sjb.api.learning.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    public Optional<Course> findByName(String name);

}
