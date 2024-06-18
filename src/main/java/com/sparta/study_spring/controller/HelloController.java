package com.sparta.study_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 외부(Postman) 호출 테스트
     * @return Hello World
     */
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World";
    }
}
