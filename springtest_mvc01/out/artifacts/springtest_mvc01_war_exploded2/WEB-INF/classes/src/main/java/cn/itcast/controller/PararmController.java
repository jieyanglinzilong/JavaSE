package cn.itcast.controller;

import cn.itcast.doimn.Account;
import cn.itcast.doimn.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parms")
public class PararmController {
    @RequestMapping("/testparms")
    public  String testparms(String username){
        System.out.println("执行成功");
        System.out.println(username);
        return "success";
    }
    @RequestMapping("/saveAccount")
    public  String saveAccount(Account account){
        System.out.println("执行成功");
        System.out.println(account);
        return "success";
    }
    @RequestMapping("/saveUser")
    public  String saveUser(User user){
        System.out.println("执行成功");
        System.out.println(user);
        return "success";
    }



}
