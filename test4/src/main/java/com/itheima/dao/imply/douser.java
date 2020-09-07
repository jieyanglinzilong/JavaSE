package com.itheima.dao.imply;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class douser implements IUserDao {
    private SqlSessionFactory factory;
    public  douser( SqlSessionFactory factory){
        this.factory=factory;
    }
    public List<User> findAll() {
        SqlSession session=factory.openSession();
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        return users;
    }

    public void saveuser(User us) {

         SqlSession session=factory.openSession();
         session.insert("com.itheima.dao.IUserDao.saveuser",us);
         session.commit();
         session.close();



    }

    public List<User> find(Integer id) {
        SqlSession session=factory.openSession();
        List<User> user=session.selectList("com.itheima.dao.IUserDao.find",id);
        session.close();

        return user;

    }

    public List<User> findname(String username) {
        return null;
    }
    public  List<User> findcondition(User user){
        SqlSession session=factory.openSession();
        List<User> users=session.selectList("com.itheima.dao.IUserDao.findcondition",user);
        return  users;
    }

}
