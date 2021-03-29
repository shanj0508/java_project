package com.github.shanj.objpersonconstr;

class Person {
    private String name;
    private int age;

    public Person() {
    }

    //构造函数
    public Person(String name, int age) {
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
