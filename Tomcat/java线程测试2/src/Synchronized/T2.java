package Synchronized;
/**
 * Thread的单例的模式
 * **/
public class T2 implements Runnable {
    private volatile int count=100;

    /*synchronized 同步保证count的原子性及可见性一致*/
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+"count="+count);

    }
    /**
     *多线程并发
     * */
    public static void main(String args[]){
        T2 t2=new T2();

        for(int i=0;i<100;i++){
            new Thread(t2,"THREAD"+i).start();
        }
    }
}
