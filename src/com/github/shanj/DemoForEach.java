package com.github.shanj;

/*
利用for each循环对数组每个元素求和
* */
public class DemoForEach {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i : ns) {
            sum = sum + i;
            System.out.println("i:" + i);
        }
        System.out.println("sum:" + sum);
    }
}
