package com.github.shanj.objextprimstudent;

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
