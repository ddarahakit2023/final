package com.sjb.api.ex01.controller;

import com.sjb.api.ex01.model.Ex01;
import com.sjb.api.ex01.service.Ex01Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Ex01Controller {
    private final Ex01Service ex01Service;
    @RequestMapping("/test")
    public Ex01 ex01() {
        return ex01Service.ex01Test("test01@test.com", "qwer1234");
    }
}
