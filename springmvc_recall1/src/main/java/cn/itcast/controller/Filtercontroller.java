package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("filter")
public class Filtercontroller {
    @RequestMapping("ln")
    public String dnms(){
     System.out.println("控制输入");
        return "success";
    }
}
