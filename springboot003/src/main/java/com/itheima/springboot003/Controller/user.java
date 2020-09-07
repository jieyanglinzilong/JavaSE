package com.itheima.springboot003.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user {
    @RequestMapping("/hello")
            public String run1(){
        return "springboot第一个程序";
    }}

