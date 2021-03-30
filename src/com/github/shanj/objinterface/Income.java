package com.github.shanj.objinterface;
//TODO:在接口中定义income变量，如何在子类中使用变量？
interface Income {
    //public static final 省略
    double income = 0;

//    static void Income(double income) {
//        income = income;
//    }

    double getTax();
}
