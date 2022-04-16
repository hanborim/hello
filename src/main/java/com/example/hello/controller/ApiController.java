package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 classs는 rest api 처리하는 컨트롤러
@RequestMapping("/api") //url를 지정해주는 어노테이션 , 주소 맵핑
public class ApiController {

    @GetMapping("/hello") //http://localhost:8080/api/hello
    public String hello()
    {
        return "hello spring boot";
    }

}