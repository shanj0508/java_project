package com.github.shanj.objpersonconstr;

class Person1 {
    private String name;
    private int age;

    public Person1() {
    }

    //构造函数
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
