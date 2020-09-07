package com.kuang.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String fristName;
    private int age;

    public String getFristname() {
        return fristName;
    }

    public void setFristname(String fristName) {
        this.fristName = fristName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "fristname='" + fristName + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public Dog(String fristname, int age) {
        this.fristName = fristname;
        this.age = age;
    }
}
