package cn.itcast.controller;


import cn.itcast.Services.EmployeesServices;
import cn.itcast.dao.Userdao;
import cn.itcast.domin.Employees;
import cn.itcast.domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Web")
public class frist {
    @Autowired
    private EmployeesServices employeesServices;
    @Autowired
    private Userdao userdao;
    @RequestMapping("sun")
    public String toSum(Model model){

        System.out.println("控制层查账户信息");

        List<Employees> employees= employeesServices.findalll();

        model.addAttribute("list",employees);
        return "success";
    }
    @RequestMapping("add")
    public String tosun(User user,Model model) throws Exception{
        System.out.println(user);
        userdao.add(user);
        model.addAttribute("msg",user);




        return "success";

    }
}
