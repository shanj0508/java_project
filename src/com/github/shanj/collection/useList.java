package com.github.shanj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class useList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add("pear"); // size=2
        list.add("apple"); // 允许重复添加元素，size=3
        System.out.println("size:"+list.size());
        System.out.println("list:"+list);

        System.out.println("for循环遍历:");

        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("Iterator遍历:");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("for each默认使用Iterator遍历:");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
