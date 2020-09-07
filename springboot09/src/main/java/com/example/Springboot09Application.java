package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan({"com.example"})
@MapperScan("com.example")
public class Springboot09Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09Application.class, args);
    }

}
