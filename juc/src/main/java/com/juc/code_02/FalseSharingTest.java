package com.juc.code_02;

public class FalseSharingTest {
    public static void main(String[] args) throws InterruptedException {
        testPointer(new Pointer());
    }

    private static void testPointer(Pointer pointer) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.x++;

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                pointer.y++;

            }
        });
        t1.start();
        t2.start();
        //当前线程挂起等待其他线程执行完
        t1.join();
        t2.join();
        System.out.println(pointer.x + "," + pointer.y);
        System.out.println(System.currentTimeMillis() - start);
    }
}

class Pointer {
    volatile long x;
    //为共享相差十倍
    long p1, p2, p3, p4, p5, p6, p7;
    volatile long y;
}
