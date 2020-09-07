package lzl.com.example.demo.Service;

import lzl.com.example.demo.dao.AccountDao;
import lzl.com.example.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void tranfer(Account accountin,Account accountout)  {

        try {
            accountDao.updatein(accountin);
            System.out.println("正在处理转账............");
            Thread.sleep(10000000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.updateout(accountout);


    }
    public List<Account> find(){
        List<Account> accountList=accountDao.findAccount();
        return  accountList;
    }

}
