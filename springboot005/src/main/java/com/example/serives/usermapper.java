package com.example.serives;

import com.example.domin.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface usermapper {
    @Select("select*from user")
    List<user> find();
}
