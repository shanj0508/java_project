package com.github.shanj.incomabs;

class SalaryAbstract extends IncomeAbstract {

    public SalaryAbstract(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}