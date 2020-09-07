package day01.Thread;

public class thread_methods {
    public static void main(String[] args){
        //testslepp();
        testyied();
        //testjoin();
    }
    static void testslepp(){
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("A"+i);
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
    /*cpu用yied表示让出cpu
    *
    *
    *
    *
    * */

    static void testyied(){
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("a"+i);
                if(i%10==0)
                    Thread.yield();
            }
        }).start();
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("b"+i);
                if(i%10==0)
                    Thread.yield();
            }
        }).start();
    }
    static  void testjoin(){
        Thread thread1=new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println("A"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 =new  Thread(()->{
            try{
                thread1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for(int i=0;i<100;i++){
                System.out.println("B"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
