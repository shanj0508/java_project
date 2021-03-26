package com.github.shanj.basic;

import java.util.Scanner;
/*
* 请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），
* 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
* */

public class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("请输入上次考试成绩： "); // 打印提示
        int gradeOld = scanner.nextInt();
        System.out.print("请输入本次考试成绩: "); // 打印提示
        int gradeNew = scanner.nextInt();
        double increase = (double) (gradeNew - gradeOld) / gradeOld * 100;

        System.out.println("gradeOld:" + gradeOld);
        System.out.println("gradeNew:" + gradeNew);
        System.out.println("increase:" + increase);
        System.out.printf("成绩提高了 %.2f%%", increase);
    }
}
