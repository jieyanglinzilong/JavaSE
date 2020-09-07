package day01.startThred_methods;

import java.util.concurrent.*;

public class CreateThread {
    static  class Mythread extends Thread{

        @Override
        public void run() {
            System.out.println(" Mythread extends Thread run");
        }
    }
    static  class  Mythread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("  Mythread2 implements Runnable run");
        }
    }
    static class Mythread3 implements Callable<String>{
        @Override
        public String call() throws Exception {
            System.out.println(" Mythread3 implements Callable<String> run");
            return "success";
        }
    }
    public  static void  main(String args[]){
        new Mythread().start();
        new Thread(new Mythread2()).start();
        new Thread(()->{
            System.out.println("Lambda run");
        });
        //以以线程池的方式启动
        Thread thread=new Thread(new FutureTask<String>(new Mythread3()));
        thread.start();

        ExecutorService service= Executors.newCachedThreadPool();
        service.execute(()->{
            System.out.println("ThreadPool");
        });
        service.shutdown();
    }

}
