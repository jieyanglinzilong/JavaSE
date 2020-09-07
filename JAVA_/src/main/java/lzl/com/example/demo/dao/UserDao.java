package lzl.com.example.demo.dao;




import lzl.com.example.demo.domain.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findUser();
    void saveUser(User user);
    void deleteUser();
    User findById(Integer id);
    List<User> findchoose(List<Integer> id);
    List<User>  findByName(String name);
    @Insert("insert into user(name,registration,sex,address,email,word)values(#{name},#{registration},#{sex},#{address},#{email},#{word})")
    void add(User user);
    @Select("select *from user where name=#{name}")
    User findByname(String name);


}
