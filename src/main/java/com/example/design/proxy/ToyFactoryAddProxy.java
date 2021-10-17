package com.example.design.proxy;
/**
 * 这是个给小动物加配件的代理类，并且能控制哪种生产哪种不生产
 */
public class ToyFactoryAddProxy implements Produce{
    private Produce Produce;
    private String condition1;
    private String condition2;

    public ToyFactoryAddProxy(Produce Produce, String condition1, String condition2) {
        this.Produce = Produce;
        this.condition1 = condition1;
        this.condition2 = condition2;
    }

    @Override
    public void produce_cat() {
        if("N".equals(condition1)){
            this.Produce.produce_cat();
            System.out.println("添加上围脖");
        }else {
            System.out.println("不允许生产围脖猫");
        }
    }

    @Override
    public void produce_deer() {
        if("N".equals(condition2)) {
            this.Produce.produce_deer();
            System.out.println("添加上铃铛");
        }else {
            System.out.println("不允许生产铃铛鹿");
        }
    }
}
