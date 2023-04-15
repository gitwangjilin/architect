package com.juc.code_05;

public class ThreadInterruptTest {
    static int i = 0;

    public static void main(String[] args) {
        System.out.println("begin");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    i++;
                    System.out.println(i);
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("=======");
                    }
                    if (i == 10) {
                        break;
                    }
                }
            }
        });
        thread.start();
        thread.interrupt();
    }
}
