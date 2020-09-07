package lzl.com.example.demo.Service;

import lzl.com.example.demo.dao.AccountDao;
import lzl.com.example.demo.dao.Infodao;
import lzl.com.example.demo.dao.PointDao;
import lzl.com.example.demo.dao.UserDao;
import lzl.com.example.demo.domain.Account;
import lzl.com.example.demo.domain.Point;
import lzl.com.example.demo.domain.User;
import lzl.com.example.demo.domain.info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;

@Service
public class ResiterService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private Infodao infodao;
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private PointDao pointDao;
    @Transactional
    public int addInformation(User user){
        System.out.println(user);
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        java.sql.Date  sqlDate = new java.sql.Date(date.getTime());
        user.setRegistration(sqlDate);
        userDao.add(user);
        User user1=userDao.findByname(user.getName());
        Account account=new Account();
        account.setMoney(0.0);
        account.setUid(user1.getId());
        accountDao.add(account);
        info info =new info();
        info.setId(user1.getId());
        info.setName(user.getName());
        info.setWord(user.getWord());
        info.setEmail(user.getEmail());
        info.setId(user1.getId());
        infodao.addInformation(info);
        Point point=new Point();
        point.setRank(1);
        point.setPoint(0);
        point.setUid(user1.getId());
        pointDao.addPoint(point);

       return user1.getId();
    }

}
