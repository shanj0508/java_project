package com.github.shanj;

import java.util.Arrays;

public class DemoSortArrays {
    public static void main(String[] args){
        int[] ns = { 12, 18, 28, 65, 89, 73 };
        //排序前：
        System.out.println(Arrays.toString(ns));
        //冒泡排序：
        for (int i = 0; i < ns.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
       // Arrays.sort(ns);
        //排序后：
        System.out.println(Arrays.toString(ns));
    }
}
