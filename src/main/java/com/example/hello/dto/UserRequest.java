package com.example.hello.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private  String name ;
    private  String email;
    private  int age;


    @Override
    public String toString()
    {
        return "UserRequset{" +
                "name : " +name+ "emaol : " +email + "age 333" + age;
    }
}
