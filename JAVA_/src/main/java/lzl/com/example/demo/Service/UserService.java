package lzl.com.example.demo.Service;

import lzl.com.example.demo.dao.UserDao;
import lzl.com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * 注入userdao
     */
    @Autowired
    private UserDao userDao;
    public User findById(Integer id){
        User user=userDao.findById(id);
        return user;
    }
}
