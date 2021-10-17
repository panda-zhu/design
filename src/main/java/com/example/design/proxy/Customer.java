package com.example.design.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class Customer {
    public static void main(String[] args) {
        //静态代理
//        ToyFactory toyFactory = new ToyFactory();
//        ToyFactoryTimeProxy toyFactoryTimeProxy = new ToyFactoryTimeProxy(toyFactory);
//        ToyFactoryLogProxy toyFactoryLogProxy = new ToyFactoryLogProxy(toyFactoryTimeProxy);
//        toyFactoryLogProxy.produce_cat();


        //生成动态代理类
//        byte[] Proxy0s = ProxyGenerator.generateProxyClass("12345", ToyFactory.class.getInterfaces());
//        String path = "C:\\Users\\panda_zhu\\Desktop\\12345.class";
//        try{
//            FileOutputStream fos = new FileOutputStream(path);
//            fos.write(Proxy0s);
//            fos.flush();
//            System.out.println("编译文件生成完毕！");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ToyFactory toyFactory = new ToyFactory();
        //使用动态代理
        Produce o = (Produce)Proxy.newProxyInstance(toyFactory.getClass().getClassLoader(), toyFactory.getClass().getInterfaces(), new MyInvocationHandler(toyFactory));
        o.produce_deer();

    }
}
