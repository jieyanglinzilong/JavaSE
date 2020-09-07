package com.itheima.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class tranfer {
    @Around("myPointcut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        System.out.println("开始执行流程");
        Object object=proceedingJoinPoint.proceed();

        try{




        }catch (Exception e){

        }finally {

        }

        return  object;

    }
}
