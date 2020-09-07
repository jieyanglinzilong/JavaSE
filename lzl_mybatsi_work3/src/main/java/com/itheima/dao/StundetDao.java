package com.itheima.dao;


import com.itheima.domin.student;

import java.util.List;

public interface StundetDao {
   void add(student student);
   List<student> find(int id);
   List<student> likefind(String major);
   void addmore(List<student> students);
   void update(int id);
   void delete(String major);
   void update1(student student);
   List<student> findlist(List<Integer> id);
}
