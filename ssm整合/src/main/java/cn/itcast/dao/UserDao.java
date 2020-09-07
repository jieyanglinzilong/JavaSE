package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.po.Users;



import java.util.List;

public interface  UserDao {

    List<User> findUser();
    void saveUser(User user);
    void deleteUser();
    List<User> findbyid(Integer id);
    List<User> findchoose( List<Integer> id);
    List<cn.itcast.po.User> lianhe();
    List<Users> con();

}
