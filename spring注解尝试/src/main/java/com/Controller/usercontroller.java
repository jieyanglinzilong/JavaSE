package com.Controller;

import com.dao.services;
import com.domin.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller("Contolltroller")
public class usercontroller {
    @Autowired
    private services services;
    public void find(){
        this.services.find();

    }
    public  void save(Account account){
        this.services.save(account);
    }
    public void findbyid(Integer id){
        this.services.findbyid(id);
    }



}
