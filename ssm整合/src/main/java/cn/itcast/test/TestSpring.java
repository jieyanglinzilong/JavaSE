package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    @Test
    public  void run1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as=( AccountService) ac.getBean("accountService");
        List<Account> accounts=as.findall();
        for(Account account:accounts){
            System.out.println(account);
        }





    }
    @Test
    public void run2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as=( AccountService) ac.getBean("accountService");
        Account account=new Account();
        account.setMoney(6540);
        account.setUid(1013);
        as.saveAccount(account);
        System.out.println("插入成功");
    }

    //配置开发

}
