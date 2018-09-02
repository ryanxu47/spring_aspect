package com.windbag.aspectJ.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by windbag7 on 2018/8/31.
 */
@Aspect
public class MyAspectAnno {
    @Before(value = "myPointcut1()")
    public void before(){
        System.out.println("前置通知==================");
    }

    @AfterReturning(value = "execution(* com.windbag.aspectJ.demo1.ProductDao.update(..))",returning = "result")
    public void afterReturing(Object result){
        System.out.println("后置通知==================" + result);
    }

    @Around(value = "execution(* com.windbag.aspectJ.demo1.ProductDao.delete(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知================");
        /*执行目标方法*/
        Object obj = joinPoint.proceed();
        System.out.println("环绕后通知================");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.windbag.aspectJ.demo1.ProductDao.findone(..))",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常抛出通知=============" + e.getMessage());
    }

    @After(value = "execution(* com.windbag.aspectJ.demo1.ProductDao.findAll(..))")
    public void after(){
        System.out.println("最终通知================");
    }

    @Pointcut(value = "execution(* com.windbag.aspectJ.demo1.ProductDao.save(..))")
    private void myPointcut1(){

    }
}
