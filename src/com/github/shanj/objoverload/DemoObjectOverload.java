package com.github.shanj.objoverload;

public class DemoObjectOverload {

    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        System.out.println("ming.name:" + ming.getName());
        Person hong = new Person();
        hong.setName("Xiao", "Hong");
        System.out.println("hong.name:" + hong.getName());

    }
}

