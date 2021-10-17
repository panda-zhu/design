package com.example.design.proxy;
/**
 * 生产方法统计时间的代理类
 */
public class ToyFactoryTimeProxy implements Produce{
    private Produce produce;


    public ToyFactoryTimeProxy(Produce produce) {
        this.produce = produce;
    }

    @Override
    public void produce_cat() {
        long startTime = System.currentTimeMillis();
        this.produce.produce_cat();
        long endTime = System.currentTimeMillis();
        long takeTime = endTime - startTime;
        System.out.println("log-----cat take time="+takeTime);
    }

    @Override
    public void produce_deer() {
        long startTime = System.currentTimeMillis();
        this.produce.produce_deer();
        long endTime = System.currentTimeMillis();
        long takeTime = endTime - startTime;
        System.out.println("log-----deer take time="+takeTime);
        
    }
}
