package com.itheima.dao;

import com.itheima.PO.StudentImpl;

import java.util.List;

public interface StudentsDao {
    List<StudentImpl> find(Integer id);
}
