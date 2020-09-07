package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;

@Controller
@RequestMapping(path = "anno")

public class AnnoController {


    @RequestMapping("/testRequestParm")
    public String testRequestParm(@RequestParam(name= "username") String name){
       System.out.println("成功");
       System.out.println(name);
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){

        System.out.println("成功");
        System.out.println(body);
        return "success";
    }
    //
    @RequestMapping("/testPathVarible/{id}")
    public String testPathVarible(@PathVariable(name="id") String id){

        System.out.println("成功");
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/testModleAttribute")
    public String testModleAttribute(){

        System.out.println("成功");

        return "success";
    }
    @ModelAttribute
    public  void showuser(){
        System.out.println("showuser执行成功");
    }
    @RequestMapping(value = "/testSeesionAttributes")
    public  String testSeesionAttributes(Model model){
        System.out.println(" testSeesionAttributes注解支持");
        model.addAttribute("msg","美美");
        return "success";
    }

}
