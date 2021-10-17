package com.example.design.proxy;

import java.util.Random;

/**
 * 委托者，原始类,一个生产玩偶的工厂
 */
public class ToyFactory implements Produce {
    @Override
    public void produce_cat() {
        System.out.println("生产了一只小猫");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void produce_deer() {
        System.out.println("生产了一只小鹿");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
