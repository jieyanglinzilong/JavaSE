package com.example.springboot_huancun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringbootHuancunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHuancunApplication.class, args);
    }

}
