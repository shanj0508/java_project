package com.github.shanj.incomabs;

/**
 * abstract抽象类 getTax()
 */

public abstract class Income {
    protected double income;
    public Income(double income) {
        this.income = income;
    }

    public abstract double getTax();
}