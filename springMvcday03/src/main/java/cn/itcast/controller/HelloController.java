package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {
    @RequestMapping(path ="/Hello")
    public String sayHello(){
        System.out.println("你好");
        return "success";
    }
    @RequestMapping(value = "/testRequestmapping",params = {"username"},headers = "Accept")
    public  String testRequestmapping(){
        System.out.println("RequestMapping注解支持");
        return "success";
    }







}
