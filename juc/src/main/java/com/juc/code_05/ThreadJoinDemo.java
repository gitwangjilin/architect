package com.juc.code_05;

public class ThreadJoinDemo {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t begin");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t finished");
            }
        });
        long start = System.currentTimeMillis();
        thread.start();
        //主线程等待线程T执行完
        thread.join();
        System.out.println("执行时间：" + (System.currentTimeMillis() - start));
        System.out.println("Main finished");
    }
}
