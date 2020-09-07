package com.company.父类加载;

public class test1 {
    static class father{
        public  static  int a=3;
        static {
          a=2;
        }

    }
    static class son extends father{

      public  static int b=father.a;

    }

    public static void main(String args[]){
        System.out.println(son.b);

    }
}
