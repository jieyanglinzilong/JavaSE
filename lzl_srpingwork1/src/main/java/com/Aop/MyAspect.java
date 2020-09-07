package com.Aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_Persimsimons();
        Object object= methodInvocation.proceed();
        log();
        return object;
    }
    public void check_Persimsimons(){
        System.out.println("模拟检查权限");
    }
    public  void log(){
        System.out.println("模拟记录日志");
    }
}
