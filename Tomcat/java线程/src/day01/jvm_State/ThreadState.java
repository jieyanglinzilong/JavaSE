package day01.jvm_State;

public class ThreadState {
    static class Mythread extends Thread{
        @Override
        public void run() {
            /**
             * 显示当前线程的状态
             * 线程有：Runnable :Ready(就绪),Running
             * **/
            System.out.println(this.getState());
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(i);
            }

        }
        public static void main(String args[]){
            Thread thread=new Mythread();
            System.out.println(thread.getState());
            thread.start();
            try{
                /**加入新线程
                 * *
                 *
                 */

                System.out.println("YES");
                thread.join();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        }
    }
}
