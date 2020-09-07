package com.kuang.config;


import org.springframework.context.annotation.Configuration;


import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration

public class MvcConfig implements WebMvcConfigurer {
    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("kuang").setViewName("test");
    }
//自定义组件交给springboot

}
