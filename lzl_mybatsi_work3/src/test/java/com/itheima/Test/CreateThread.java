package com.itheima.Test;

import java.util.concurrent.Callable;


public class CreateThread {
    static  class Mythread extends Thread{

        @Override
        public void run() {
            System.out.println(" Mythread extends Thread run");
        }
    }
    static  class  Mythread2 implements Runnable{

        public void run() {
            System.out.println("  Mythread2 implements Runnable run");
        }
    }

    public  static void  main(String args[]){
        new Mythread().start();
        new Thread(new Mythread2()).start();
       
    }
}
