package com.example.it;

import com.example.domin.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Artimapper {
   List<Article> find();
}
