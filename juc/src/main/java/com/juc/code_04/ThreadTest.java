package com.juc.code_04;

import java.util.ArrayList;
import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            };
            thread.start();
            thread.join();
        }
        //时间：11337
        System.out.println("时间：" + (System.currentTimeMillis() - start));
        //大小：100000
        System.out.println("大小：" + list.size());
    }
}
