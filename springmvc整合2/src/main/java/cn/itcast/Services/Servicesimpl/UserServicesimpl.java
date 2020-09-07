package cn.itcast.Services.Servicesimpl;

import cn.itcast.Services.UserServices;
import cn.itcast.dao.Userdao;
import cn.itcast.domin.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServicesimpl implements UserServices {
    @Autowired
    Userdao userdao;
    @Override
    public void add(User user) {
        userdao.add(user);
        System.out.println("插入成功");
    }
}
