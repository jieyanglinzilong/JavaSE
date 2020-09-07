package com.Services;

import com.dao.IAccountDao;
import com.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("userdao")
public class userrimpl implements Userdao {

    public void save() {

        System.out.println("注解模拟成功");


    }
}
