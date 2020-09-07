package cn.itcast.controller;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/find")
    public String find(Model model){
        List<User> users=userDao.findUser();


        model.addAttribute("list",users);
        return "list";

    }

}
