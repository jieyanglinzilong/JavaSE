package lzl.com.example.demo.Controller;

import lzl.com.example.demo.Service.EmailService;
import lzl.com.example.demo.Service.ResiterService;
import lzl.com.example.demo.dao.UserDao;
import lzl.com.example.demo.domain.Reload;
import lzl.com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("Re")
public class ResiterController {
    @Autowired
    private EmailService emailService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ResiterService resiterService;


    @PostMapping("re")
    public String Beforeresiter(){



        return "Registered";

    }

    @RequestMapping("submit")
    public String Afterresiter( User user){
        System.out.println(user);
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        java.sql.Date  sqlDate = new java.sql.Date(date.getTime());
        String to= user.getEmail();
        String subject="兴华银行";
        System.out.println(user);

        String key="hash2";
        Reload reload=new Reload();

        resiterService.addInformation(user);
        User user1=userDao.findByname(user.getName());
        String text="恭喜"+user.getName()+"成功注册兴华银行"+"您的账户为"+user1.getId()+"请根据账号和密码登陆"+"若有疑问可由1679569188@qq.com联系";
        emailService.sendSimpleEmail(to,subject,text);
        reload.setEmail(user1.getEmail());
        reload.setId(user1.getId());
        reload.setWord(user1.getWord());

        Map<Integer,Reload> map=new HashMap<Integer, Reload>();
        map.put(user1.getId(),reload);
        redisTemplate.opsForHash().put(key,user1.getId(),map);



        return "index";

    }

    @RequestMapping("sendEmail")
    public String ResiterEmail(){



        return "index";

    }
}
