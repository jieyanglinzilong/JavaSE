package Block;

public class T {
    public  synchronized void run1(){
        System.out.println(Thread.currentThread().getName()+"测试一");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public  synchronized  void run2(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"测试二");
    }
    public static void main(String args[]){
        T t=new T();
        new Thread(t::run1,"t1").start();
        new Thread(t::run2,"t1").start();
    }
}
