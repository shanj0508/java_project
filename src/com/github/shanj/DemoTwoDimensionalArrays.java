package com.github.shanj;

/*
 * 使用二维数组可以表示一组学生的各科成绩，请计算所有学生的平均分：
 * */
public class DemoTwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        double average;
        double sum = 0;
        int count = 0;
        for (int[] arr : scores) {
            for (int i : arr) {
                sum = sum + i;
                count += 1;

            }
        }
        average = sum / count;
        System.out.println("average:" + average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }

    }
}
