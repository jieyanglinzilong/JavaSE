package lzl.com.example.demo.Service;

import lzl.com.example.demo.dao.AccountDao;
import lzl.com.example.demo.dao.TranferDao;
import lzl.com.example.demo.domain.Account;
import lzl.com.example.demo.domain.RAccount;
import lzl.com.example.demo.domain.Tranfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@Service
public class TranferService {
    @Autowired
    private TranferDao tranferDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private AccountDao accountDao;
    String key="Account";
    @Transactional
    public Boolean tranfer(Tranfer tranfer,RAccount rAccount){
         System.out.println(tranfer);
         Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        rAccount.setMoney((rAccount.getMoney()-tranfer.getMoney()));
        System.out.println("修改后的"+rAccount);
        redisTemplate.opsForHash().put(key,tranfer.getUid(),rAccount);

        Timestamp timeStamp = new Timestamp(date.getTime());
        System.out.println(timeStamp);

        tranfer.setTime(timeStamp);

        int n=tranferDao.tranfer(tranfer);
        Account accountin=new Account();
        accountin.setMoney(tranfer.getMoney());
        accountin.setUid(tranfer.getRid());
        System.out.println(accountin);
        Account accountout=new Account();
        accountout.setUid(tranfer.getUid());
        accountout.setMoney(tranfer.getMoney());
        System.out.println(accountout);
        accountDao.updateout(accountout);
        accountDao.updatein(accountin);
        List<Account> accountList=accountDao.findByUid(tranfer.getUid());
        System.out.println(accountList);

        return  true;
    }


}
