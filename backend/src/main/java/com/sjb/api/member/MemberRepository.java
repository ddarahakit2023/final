package com.sjb.api.member;

import com.sjb.api.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByEmail(String email);
    public Optional<Member> findByEmail(String email);

}
