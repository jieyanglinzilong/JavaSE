package lzl.com.example.demo.dao;


import lzl.com.example.demo.domain.Employees;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Employeesdao {

    List<Employees> findAll();

    void insert(Employees employees);
}
