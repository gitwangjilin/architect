package com.juc.code_05;

public class WaitDemo {
    private static Object lock = new Object();
    private static boolean flag = true;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while (flag) {
                        try {
                            lock.wait();
                            System.out.println("wait start......");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("wait end ......");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (flag) {
                    synchronized (lock) {
                        if (flag) {
                            lock.notify();
                            System.out.println("notify........");
                            flag = false;
                        }
                    }
                }
            }
        }).start();
    }
}
