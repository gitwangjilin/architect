package com.collection;

import java.util.HashMap;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: MapTest
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
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Aa","1");
        hashMap.put("BB","13");
        if ("Aa".hashCode() =="BB".hashCode()) {
            System.out.println("相同");
        }
        System.out.println(hashMap.get("BB"));
        System.out.println(hashMap.get("Aa"));
        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());


    }
}
