package com.juc.code_05;

public class SellTicketDome implements Runnable {
    /**
     * 车票
     */
    private int ticket;

    public SellTicketDome() {
        this.ticket = 1020;
    }

    @Override
    public void run() {
        while (ticket > 0) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：正在执行操作，余票：" + ticket--);
                }
            }
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        SellTicketDome sellTicketDome = new SellTicketDome();
        Thread thread1 = new Thread(sellTicketDome, "thread1");
        Thread thread2 = new Thread(sellTicketDome, "thread2");
        Thread thread3 = new Thread(sellTicketDome, "thread3");
        Thread thread4 = new Thread(sellTicketDome, "thread4");
        Thread thread5 = new Thread(sellTicketDome, "thread5");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread4.setPriority(Thread.MIN_PRIORITY);
        thread5.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
