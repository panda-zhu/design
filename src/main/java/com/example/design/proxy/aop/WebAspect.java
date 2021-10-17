package com.example.design.proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebAspect {
    /*
    *  切点，用来匹配需要切入的并增强的目标方法
    *  下面的表示com.example.design.proxy.aop包下所有类的所有方法
    *   匹配规则很灵活可以自行百度
    */
    @Pointcut("execution(* com.example.design.proxy.aop.*.*(..))")
    public void pointCut(){

    }

    /*
    * 在方法执行前开始执行
    * */
    @Before("pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知开始。。");
        Signature signature = joinPoint.getSignature();
        System.out.println("目前代理的是哪一个方法："+ signature.getName());
    }

    /*
     * 在方法执行后开始执行
     * */
    @After("pointCut()")
    public void afterAdvice(){
        System.out.println("后置通知开始。。");
    }


    @AfterReturning(value = "execution(* com.example.design.proxy.aop.*.*(..))",returning = "args")
    public void afterReturningAdvice(JoinPoint joinPoint,String args){
        System.out.println("后置返回通知开始。。");
        System.out.println("返回值是："+args);
    }



}
