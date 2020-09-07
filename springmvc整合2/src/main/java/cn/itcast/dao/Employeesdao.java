package cn.itcast.dao;

import cn.itcast.domin.Employees;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Employeesdao {
    @Select("select*from employees ")
    List<Employees> findAll();
    @Insert("insert into  employees(emp_no,birth_date,first_name,last_name,gender,hire_date)values(#{emp_no},#{birth_date},#{first_name},#{last_name},#{gender},#{hire_date})")
    void insert(Employees employees);
}
