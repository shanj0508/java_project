package com.github.shanj.objpersonconstr;

public class DemoObjectPersonConstruction {
    public static void main(String[] args) {
        Person ming = new Person("小明", 18);
        System.out.println("姓名：" + ming.getName());
        System.out.println("年龄：" + ming.getAge());


    }
}

