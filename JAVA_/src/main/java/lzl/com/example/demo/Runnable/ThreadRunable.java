package lzl.com.example.demo.Runnable;

import lzl.com.example.demo.Service.AccountService;
import lzl.com.example.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;

public class ThreadRunable implements Runnable {
    @Autowired
    private volatile AccountService accountService;
    private static Integer id;
    @Override
    public synchronized void run() {
        System.out.println("开始操作");
        Account accountin=new Account();
        accountin.setAid(1);
        accountin.setUid(1001);
        accountin.setMoney(94.0);
        Account accountout=new Account();
        accountout.setAid(2);
        accountout.setUid(1002);
        accountout.setMoney(94.0);
        accountService.tranfer(accountin,accountout);
        System.out.println("完成第%s次转账行动"+id);

    }
    public static void main(String args[]){
        ThreadRunable threadRunable=new ThreadRunable();
        for(int i=0;i<10;i++){
            new Thread(threadRunable,"thread"+i).start();
        }
    }
}
