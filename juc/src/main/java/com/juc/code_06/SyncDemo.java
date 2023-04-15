package com.juc.code_06;

public class SyncDemo {
    private static int counter = 0;
    public static String lock = "";

    //    private static synchronized void increment() {
    private static void increment() {
        synchronized (lock) {
            counter++;
        }
    }

    //    public static synchronized void decrement() {
    public static void decrement() {
        synchronized (lock) {
            counter--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                increment();
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                decrement();
            }
        }, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}
