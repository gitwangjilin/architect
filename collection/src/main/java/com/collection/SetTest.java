package com.collection;

import java.util.Arrays;
import java.util.HashSet;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: SetTest
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
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("12");
        hashSet.add("13");
        hashSet.add("14");
        hashSet.add("15");
        System.out.println(Arrays.asList(hashSet));
    }
}
