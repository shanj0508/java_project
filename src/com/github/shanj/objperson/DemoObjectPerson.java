package com.github.shanj.objperson;

public class DemoObjectPerson {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println("name：" + ming.getName());
        System.out.println("age：" + ming.getAge());


    }
}

