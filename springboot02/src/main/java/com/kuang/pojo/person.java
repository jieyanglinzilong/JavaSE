package com.kuang.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class person {
    @Email()
    private String name;
    private Integer age;
    private Date birth;
    private  Dog dog;
    private List<Object> list;
    private Map<String,Object> map;

    public person() {
    }

    public person(String name, Integer age, Date birth, Dog dog, List<Object> list, Map<String, Object> map) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.dog = dog;
        this.list = list;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", dog=" + dog +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
