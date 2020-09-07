package com.itheima.controller;


import com.itheima.Services.AccountService;
import com.itheima.dao.UserDao;
import com.itheima.domin.Account;
import com.itheima.domin.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;



    @RequestMapping("/findAll")
    public String findAll(Model model) throws  Exception{
        SqlSession session;
        UserDao userDao;

        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        System.out.println("初始化.....");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(UserDao.class);




        System.out.println("表现层：查询所有账户...");





        List<User> list=userDao.findUser();
        System.out.println("成功查询");
        model.addAttribute("list",list);
        session.close();
        in.close();
        return "list";
    }
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
    @RequestMapping("/find")

    public String find(Model model){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findall();

        model.addAttribute("list",list);
        return "logo";
    }


    @RequestMapping("/del")
    public void del(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.delete("周可");
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }






}
