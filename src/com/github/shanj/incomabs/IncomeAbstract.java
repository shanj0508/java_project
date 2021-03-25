package com.github.shanj.incomabs;

public abstract class IncomeAbstract {
    protected double income;

    public IncomeAbstract(double income) {
        this.income = income;
    }

    public abstract double getTax();
}