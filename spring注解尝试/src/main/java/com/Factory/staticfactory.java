package com.Factory;

public class staticfactory {
    public static account creatBean(){
        System.out.println("静态工厂实例化成功");
        return  new account();
    }
}
