package com.juc.code_01;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: VisibilityTest
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2023/4/6   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class VisibilityTest {
    private volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        VisibilityTest test = new VisibilityTest();
        Thread thread = new Thread(() -> test.load(), "threadA");
        thread.start();
        Thread threadB = new Thread(() -> test.refresh(), "threadB");
        threadB.start();
    }

    private void refresh() {
        flag = false;
        System.out.println(Thread.currentThread().getName() + "修改flag");
    }

    private void load() {
        System.out.println(Thread.currentThread().getName() + "开始执行A");
        int i = 0;
        while (flag) {
            i++;
        }
        System.out.println(Thread.currentThread().getName() + "跳出循环：i" + i);
    }
}
