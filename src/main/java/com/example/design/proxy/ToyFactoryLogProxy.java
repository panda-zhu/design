package com.example.design.proxy;
/**
 * 这是个生产方法打日志的代理类
 */
public class ToyFactoryLogProxy implements Produce{
    private Produce Produce;


    public ToyFactoryLogProxy(Produce Produce) {
        this.Produce = Produce;
    }

    @Override
    public void produce_cat() {
        this.Produce.produce_cat();
        System.out.println("log-----cat is produced");
    }

    @Override
    public void produce_deer() {
        this.Produce.produce_deer();
        System.out.println("log-----deer is produced");
    }
}
