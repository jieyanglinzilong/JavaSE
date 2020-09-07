package Volatile;

public class Mgr02 {
    private static final Mgr02 instance;
    static {
        instance=new Mgr02();
    }
    public static Mgr02 getInstance(){
    return  instance;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String args[]){
        Mgr02 m1=Mgr02.getInstance();
        Mgr02 M2=Mgr02.getInstance();
        System.out.println(m1==M2);

    }

}