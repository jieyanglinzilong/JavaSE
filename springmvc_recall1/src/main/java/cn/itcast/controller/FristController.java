package cn.itcast.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FristController implements Controller {


    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse httpServletResponse){
        ModelAndView modelAndView=new ModelAndView();
        String name="这是我的第一个SpringMvc程序";

        modelAndView.addObject("msg",name);
        modelAndView.setViewName("success");

        return modelAndView;

    }

}
