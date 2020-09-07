package com.logger;

import org.aspectj.lang.ProceedingJoinPoint;

public class sqlException {
    public Object aroundPringLog2(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            Object[] args = pjp.getArgs();//得到方法执行所需的参数
            System.out.println("开始执行数据库查询");
            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("查询成功");
            return rtValue;
        }catch (Throwable t){
            System.out.println("查询异常异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("关闭连接");
        }

    }
}
