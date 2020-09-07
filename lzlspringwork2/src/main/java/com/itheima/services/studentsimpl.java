package com.itheima.services;

import com.itheima.dao.StundetDao;
import com.itheima.domin.student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentsimpl implements StundetDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int add() {
        String sql = "insert into student(id,name,major,department,phone)value (?,?,?,?,?)";
        Object[] parm = new Object[0];
        List<Object[]> obj=new ArrayList<Object[]>();
        obj.add(new Object[]{2018118130,"林梓龙","软件工程","计算机学院","13414834843"});
        obj.add(new Object[]{1,"A" ,"B" ,"C","D"});
        obj.add(new Object[]{2,"C","D","E","G"});
        this.jdbcTemplate.batchUpdate(sql,obj);

        int num=0;


        return num;
    }

    @Override
    public List<student> find() {
        String sql="select *from student";
        RowMapper<student>  rowMapper =new BeanPropertyRowMapper<>(student.class) ;
        return this.jdbcTemplate.query(sql,rowMapper);

    }
}
