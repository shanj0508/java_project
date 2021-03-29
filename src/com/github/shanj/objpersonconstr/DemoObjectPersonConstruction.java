package com.github.shanj.objpersonconstr;

public class DemoObjectPersonConstruction {
    public static void main(String[] args) {
        Person1 ming = new Person1("小明", 18);
        System.out.println("姓名：" + ming.getName());
        System.out.println("年龄：" + ming.getAge());


    }
}

