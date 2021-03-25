package com.github.shanj;

public class DemoObjectExtendsPrimaryStudent {
    public static void main(String[] args) {
        Person4 p = new Person4("小明", 12);
        Student1 s = new Student1("小红", 20, 99);
        Student1 ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());

    }
}

class Person4 {
    protected String name;
    protected int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Student1 extends Person4 {
    protected int score;

    public Student1(String name, int age, int score) {
        super(name, age);
        this.score = score;

    }

    public int getScore() {
        return score;
    }
}

class PrimaryStudent extends Student1 {
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

}
