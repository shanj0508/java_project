package com.github.shanj;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        //排序前：
        System.out.println(Arrays.toString(ns));
        //冒泡排序：
        for (int i = 0; i < ns.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    //如果前面的数字大于后面的数字，交换位置，大的放在后面
                    int a;
                    a = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = a;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }

        }
        //排序后：
        System.out.println(Arrays.toString(ns));

    }


}

