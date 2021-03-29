package com.github.shanj.objextprimstudent;

public class DemoObjectExtendsPrimaryStudent {
    public static void main(String[] args) {
        Person p = new Person("小明", 12);
        Student1 s = new Student1("小红", 20, 99);
        Student1 ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());

    }
}

