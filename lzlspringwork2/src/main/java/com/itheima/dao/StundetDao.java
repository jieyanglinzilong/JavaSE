package com.itheima.dao;


import com.itheima.domin.student;

import java.util.List;

public interface StundetDao {
   int add();
   List<student> find();
}
