package cn.itcast.controller;

import cn.itcast.domin.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("haha")
public class Parms {
    @RequestMapping("mn")
    public String reString(String username){

    System.out.println("执行成功  "+username);
        return "success";
    }
    @RequestMapping("save")
    public String saveAccount(Account account){
        System.out.println("执行成功  "+account);
    return "success";
    }

}
