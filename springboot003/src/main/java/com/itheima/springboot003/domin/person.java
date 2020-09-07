package com.itheima.springboot003.domin;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
public class person {
     private Integer id;
     private String name;
     private List hobby;
     private String[] family;
     private Map map;
     private  pet pets;

     public Integer getId() {
          return id;
     }

     @Override
     public String toString() {
          return "person{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", hobby=" + hobby +
                  ", family=" + Arrays.toString(family) +
                  ", map=" + map +
                  ", pets=" + pets +
                  '}';
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public List getHobby() {
          return hobby;
     }

     public void setHobby(List hobby) {
          this.hobby = hobby;
     }

     public String[] getFamily() {
          return family;
     }

     public void setFamily(String[] family) {
          this.family = family;
     }

     public Map getMap() {
          return map;
     }

     public void setMap(Map map) {
          this.map = map;
     }

     public pet getPets() {
          return pets;
     }

     public void setPets(pet pets) {
          this.pets = pets;
     }
}
