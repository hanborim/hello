package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")    //http://localhost:8080/api/get/hello
    public  String getHello()
    {
        return "get Hello";
    }

    @RequestMapping(path = "/hi" , method = RequestMethod.GET)
    public String hi()
    {
        return "hi";
    }

    //http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name)
    {
        System.out.println("PathVariable" + name);
        return name;
    }

}
