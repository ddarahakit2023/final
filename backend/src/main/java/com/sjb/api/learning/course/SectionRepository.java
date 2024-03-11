package com.sjb.api.learning.course;

import com.sjb.api.learning.course.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
