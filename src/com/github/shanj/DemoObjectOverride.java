package com.github.shanj;

/**
 * 给一个有工资收入和稿费收入的小伙伴算税。
 */


public class DemoObjectOverride {

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }

    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
                new ContributionFee(10500)
        };
        System.out.println(totalTax(incomes));
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {

    public Salary(double income) {
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


class ContributionFee extends Income {
    //稿费
    public ContributionFee(double income) {
        super(income);
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