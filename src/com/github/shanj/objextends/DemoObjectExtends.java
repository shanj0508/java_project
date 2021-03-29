package com.github.shanj.objextends;

public class DemoObjectExtends {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(18);
        System.out.println("ming.name:" + ming.getName() + "\nming.age:" + ming.getAge());
        Student student1 = new Student();
        student1.setName("学生1");
        student1.setAge(13);
        student1.setScore(99);
        System.out.println("student1.name:" + student1.getName() + "\nstudent1.age:" + student1.getAge() + "\nstudent1.score:" + student1.getScore());
    }
}

