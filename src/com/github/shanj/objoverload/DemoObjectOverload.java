package com.github.shanj.objoverload;

public class DemoObjectOverload {

    public static void main(String[] args) {
        Person2 ming = new Person2();
        ming.setName("小明");
        System.out.println("ming.name:" + ming.getName());
        Person2 hong = new Person2();
        hong.setName("Xiao", "Hong");
        System.out.println("hong.name:" + hong.getName());

    }
}

