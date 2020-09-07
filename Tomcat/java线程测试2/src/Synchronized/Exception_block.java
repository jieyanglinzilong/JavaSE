package Synchronized;

import java.util.concurrent.TimeUnit;

public class Exception_block {
    int i = 0;

    synchronized void m1()  {
        System.out.println(Thread.currentThread().getName() + "m1启动");
        while (true) {
            i++;
            System.out.println(Thread.currentThread().getName() + "start");
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();


            }
            if (i == 5) {
                int m = 1 / 0;

            }
            System.out.println(i);
        }
    }
    public static  void main(String args[]){
        Exception_block exception_block=new Exception_block();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                exception_block.m1();
            }
        };
        new Thread(runnable,"t1").start();
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(runnable,"t2").start();
    }

}