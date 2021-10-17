package com.example.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 *  自定义的invoaction类，
 */

public class MyInvocationHandler implements InvocationHandler {
    private ToyFactory toyFactory;

    public MyInvocationHandler(ToyFactory toyFactory){
        this.toyFactory = toyFactory;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行自定义方法。。");
        long startTime = System.currentTimeMillis();
        method.invoke(toyFactory,new Object[]{});
        long endTime = System.currentTimeMillis();
        System.out.println("执行"+method.getName()+"方法共耗时："+(endTime-startTime));
        return null;
    }
}
