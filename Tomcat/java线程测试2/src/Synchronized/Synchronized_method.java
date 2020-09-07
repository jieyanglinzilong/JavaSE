package Synchronized;

public class Synchronized_method  {
    private int count=10;
    private Object object=new Object();
    public void m(){
        synchronized (object){
            count--;
            System.out.println(Thread.currentThread().getName()+"count="+count);
        }


    }

}
