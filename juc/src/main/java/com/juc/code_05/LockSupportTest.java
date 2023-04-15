package com.juc.code_05;

import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {
    public static void main(String[] args) {
        Thread parkThread = new Thread(new ParkThread());
        parkThread.start();
        System.out.println("唤醒parkThread");
        LockSupport.unpark(parkThread);
    }
}

class ParkThread implements Runnable {

    @Override
    public void run() {
        System.out.println("parkThread开始执行");
        LockSupport.park();
        System.out.println("parkThread执行完成");
    }
}