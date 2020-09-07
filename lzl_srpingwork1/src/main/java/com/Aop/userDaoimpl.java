package com.Aop;

import com.dao.userdao;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class userDaoimpl implements userdao {
    public void adduser() {
        System.out.println("增加用户");
    }

    public void deleteuser() {
        System.out.println("删除用户");
    }
}
