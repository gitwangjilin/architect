package com.juc.code_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable();
        Integer call = myCallable.call();
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        MyThread myThread = new MyThread();
        myThread.run();
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
