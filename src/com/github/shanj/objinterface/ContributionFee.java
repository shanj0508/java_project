package com.github.shanj.objinterface;

public class ContributionFee implements Income {
    protected double income;

    public ContributionFee(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (income < 4000) {
            //应纳税额=（每次收入额－800）×20%×（1－30%）
            return (income - 800) * 0.2 * (1 - 0.3);
        }
        //应纳税额=每次收入额×80%×14%
        return income * 0.8 * 0.14;
    }
}
