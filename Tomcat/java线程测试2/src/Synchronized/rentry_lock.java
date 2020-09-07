package Synchronized;
/****
 * synchronized 重入锁
 */


import java.util.concurrent.TimeUnit;

public class rentry_lock {
    synchronized void m1() {
        System.out.println("M1 strart");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("ma end");
    }

    synchronized void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("M2 Start");
    }

    public static void main(String args[]) {
        new rentry_lock().m1();
    }
}