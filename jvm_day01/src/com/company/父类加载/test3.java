package com.company.父类加载;

public class test3 {
    public static void main(String args[]){
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader2=classLoader.getParent();
        System.out.println(classLoader2);
    }
}
