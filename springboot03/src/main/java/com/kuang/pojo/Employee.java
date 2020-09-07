package com.kuang.pojo;



import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor

public class Employee {
    private Integer id;
    private String lastname;
    private String email;
    private Date birth;
    private Department department;
    private Integer gender;

    public Employee(Integer id, String lastname, String email, Department department, Integer gender) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.birth = new Date();
        this.department = department;
        this.gender = gender;

    }

    public Integer getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirth() {
        return birth;
    }

    public Department getDepartment() {
        return department;
    }

    public Integer getGender() {
        return gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
