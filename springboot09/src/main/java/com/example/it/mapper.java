package com.example.it;

import com.example.domin.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface mapper {
 @Select("select*from t_comment where id=#{id}")
 public Comment findbyid(Integer id);
 @Select("select*from t_comment")
 public List<Comment> find();
}

