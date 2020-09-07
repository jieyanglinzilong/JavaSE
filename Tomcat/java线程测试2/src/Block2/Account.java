package Block2;

import java.util.concurrent.TimeUnit;

public class Account {
    String name;
    double balance;
    public   synchronized void set(String name,double balance){
        this.name=name;
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.balance=balance;
    }
    /***
     * synchronized 解决不一致问题
     */

    public synchronized double getBalance(String name){
        return  this.balance;
    }
    public static void main(String agrs[]){
        Account a=new Account();
        new Thread(()->a.set("张三",100)).start();
        try{
            /** 线程睡眠1ms,可能产生不一致问题
             * **/
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(a.getBalance("张三"));
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
           System.out.println(a.getBalance("张三"));
    }


}
