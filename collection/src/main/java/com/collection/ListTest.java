package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: ListTest
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
public class ListTest {
    public static void main(String[] args) throws InterruptedException {
        //扩容1.5
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add(null);
        list.add(null);
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
        //迭代器为线程安全在当前变量有修改则抛出 ConcurrentModificationException
//        new Thread(() -> {
//            while (iterator.hasNext()) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(iterator.next());
//            }
//        }, "A").start();
//        new Thread(() -> {
//            list.add("2");
//        }, "B").start();
//        System.out.println(Arrays.asList(list));
        //扩容1倍
        Vector vector = new Vector();
        LinkedList<String> strings1 = new LinkedList<>();

    }
}
