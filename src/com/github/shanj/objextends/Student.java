package com.github.shanj.objextends;

class Student extends Person {
    private int score;

    public void setScore(int score) {
        this.score = score;
        System.out.println("子类Student中打印父类Person的name："+name);
        System.out.println("子类Student中打印父类Person的age："+age);
    }

    public int getScore() {
        return score;
    }

}
