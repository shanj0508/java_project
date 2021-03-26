package com.github.shanj.objoverride;

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


