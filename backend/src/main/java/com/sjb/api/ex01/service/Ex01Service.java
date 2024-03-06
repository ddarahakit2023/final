package com.sjb.api.ex01.service;

import com.sjb.api.ex01.model.Ex01;
import com.sjb.api.ex01.repository.Ex01Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Ex01Service {
    private final Ex01Repository ex01Repository;

    public Ex01 ex01Test(String email, String password) {
        Ex01 ex01 = Ex01.builder()
                .email(email)
                .password(password)
                .build();
        ex01Repository.save(ex01);
        return ex01;
    }
}
