package com.company.父类加载;

public class test2 {
    public static  void main(String args[]){
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName()+"开始");
            son son=new son();
            System.out.println(Thread.currentThread().getName()+"结束");
        };
        Thread thread1=new Thread(r,"线程1");
        Thread thread2=new Thread(r,"线程2");
        thread1.start();
        thread2.start();
    }

   static class son{
     static {
         if(true){
             System.out.println(Thread.currentThread().getName()+"初始化");
             while(true){

             }
         }
     }

    }
}
