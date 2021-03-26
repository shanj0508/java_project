package com.github.shanj.basic;

import java.util.Scanner;
/*
请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
        BMI = 体重(kg)除以身高(m)的平方
        BMI结果：
        • 过轻：低于18.5
        • 正常：18.5-25
        • 过重：25-28
        • 肥胖：28-32
        • 非常肥胖：高于32
*/

public class If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("请输入身高(m)： "); // 打印提示
        double height = scanner.nextDouble();
        System.out.print("请输入体重(kg): "); // 打印提示
        double weight = scanner.nextDouble();
        double BMI  = weight/(height*height);

        System.out.println("height:" + height);
        System.out.println("weight:" + weight);
        System.out.println("BMI:" + BMI);

        if(BMI<18.5){
            System.out.println("BMI过轻:低于18.5");
        }else if(BMI>=18.5&&BMI<25){
            System.out.println("BMI正常：18.5-25");
        }else if(BMI>=25&&BMI<28){
            System.out.println("BMI过重：25-28");
        }else if(BMI>=28&&BMI<32){
            System.out.println("BMI肥胖：28-32");
        }else{
            System.out.println("BMI非常肥胖：高于32");
        }
    }

}

