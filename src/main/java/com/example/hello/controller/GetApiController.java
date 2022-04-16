package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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



//    //http://localhost:8080/api/get/path-variable/{name}
//    @GetMapping("/path-variable/{id}")
//    public String pathVariable(@PathVariable(name = "id") String pathName)
//    {
//        System.out.println("PathVariable" + pathName);
//        return pathName;
//    }

    //?key=value&key2=value2
    //http://localhost:8080/api/get/query-param?user=root&email=babo@gamil.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam  Map<String,String> queryParam)
    {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }


    @GetMapping(path = "query-param2")
    public String queryParam2(@RequestParam String name ,
                              @RequestParam String email,
                              @RequestParam int age)
    {
        System.out.println("uety-param2");
        return name + "" + email + "" + age;
    }


//객체로 들어오면 스프링부트가 알아서 판단함
//?뒤에 있는 값들을  변수와 이름매칭을 알아서 해줌
    //그래서 @RequsetParam필요 없음

    @GetMapping(path = "query-param3")
    public String queryParam3(UserRequest userRequest)
    {
        System.out.println(userRequest.getAge());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getName());

        return userRequest.toString();
    }




}
