package com.juc.code_04;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        //时间：75
        System.out.println("时间：" + (System.currentTimeMillis() - start));
    }
}
