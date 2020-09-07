package com.example.demo.dao;

import com.example.demo.domin.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Userdao {

   void add(List<User> userList);
}
