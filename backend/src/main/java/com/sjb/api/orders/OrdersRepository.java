package com.sjb.api.orders;

import com.sjb.api.learning.course.model.Course;
import com.sjb.api.member.model.Member;
import com.sjb.api.orders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    Optional<Orders> findByMemberAndCourse(Member member, Course course);
}
