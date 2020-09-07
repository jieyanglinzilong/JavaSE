package cn.itcast.dao;

import cn.itcast.domin.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdao {
    @Insert("insert into user(id,name,sexy,password,phone)values(#{id},#{name},#{sexy},#{password},#{phone})")
    void add(User user);
}
