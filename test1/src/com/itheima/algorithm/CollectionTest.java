package com.itheima.algorithm;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(s -> System.out.println(s));
    }
}
