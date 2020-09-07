package Volatile;

public class Volatile1 {
    volatile boolean running=true;
    void m(){
        System.out.println("start");
        while (running){

        }
        System.out.println("end");
    }
    public static  void  main(String args[]){}
    Volatile1 volatile1=new Volatile1();


}
