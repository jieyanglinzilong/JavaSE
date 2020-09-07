package com.AspectJ;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class myaspectj {
    @Pointcut("execution(* com.Aop.*.*(..))")
    private void mycut(){
    }
    @Before("mycut()")
    public  void  myBefore(JoinPoint joinPoint){
        System.out.println("前置通知");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("前置植入增强的方法"+joinPoint.getSignature().getName());
    }
    @AfterReturning("mycut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("后置通知");
        System.out.println("目标类是："+joinPoint.getTarget());
        System.out.println("前置植入增强的方法"+joinPoint.getSignature().getName());

    }
    @Around("mycut()")
    public void myarround(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        System.out.println("环绕通知开始");
        Object object=proceedingJoinPoint.proceed();
        System.out.println("环绕结束，模拟结束事务");

    }
    @AfterThrowing(value = "mycut()",throwing="e")
    public  void throwsable(JoinPoint joinPoint,Throwable e){
        System.out.println("出现异常"+ e.getMessage());
    }
    @After("mycut()")
    public  void myafter(){
        System.out.println("最终通知，释放资源...");
    }


}
