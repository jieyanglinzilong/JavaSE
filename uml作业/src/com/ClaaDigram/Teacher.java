package com.ClaaDigram;


import java.util.Optional;

public class Teacher extends User {
    Addinformation addinformation=null;
    Operation operation=null;
    public  void addTeacher(Teacher teacher){

        addinformation.addTeacher(teacher);
    }
    public String findPassword(User user){
             return  operation.findPassword(user);
    }
    public void change(String id,String password){

        operation.changePaaword(id,password);
    }
    public Teacher findByOneself(String id){
        Teacher teacher=operation.findByOneself(id);
        return  teacher;
    }




}
