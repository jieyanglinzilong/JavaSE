package com.itheima.services;

import com.itheima.dao.UserDao;
import com.itheima.domin.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDaoimpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> find() {
        String sql="select *from user";
        RowMapper<User> rowMapper=new BeanPropertyRowMapper<User>(User.class);
        return  this.jdbcTemplate.query(sql,rowMapper);



    }
}
