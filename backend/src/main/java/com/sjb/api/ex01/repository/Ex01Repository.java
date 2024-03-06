package com.sjb.api.ex01.repository;

import com.sjb.api.ex01.model.Ex01;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Ex01Repository extends JpaRepository<Ex01,Long> {

}
