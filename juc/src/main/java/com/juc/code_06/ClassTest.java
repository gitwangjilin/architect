package com.juc.code_06;

import org.openjdk.jol.info.ClassLayout;

public class ClassTest {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
