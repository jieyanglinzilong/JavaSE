package Volatile;

public class Mgr01 {
    /**
     *
     * 只初始化一个对象
     *
     * **/
    private static  final  Mgr01 instance=new Mgr01();
    static int i=0;
    private Mgr01(){

    }
    public static Mgr01 getInstance(){
        i++;
        return instance;
    }
    public void m(){
        System.out.println(" m ");
    }
    public static void main(String args[]){
        Mgr01 m1=Mgr01.getInstance();
        Mgr01 m2=Mgr01.getInstance();
        System.out.println(m1==m2);
    }


}
