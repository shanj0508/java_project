package com.github.shanj.incomabs;

/**
 * 用抽象类给一个有工资收入和稿费收入的小伙伴算税。
 */
public class ObjectAbstract {

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }

    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Salary(3000),
                new ContributionFeeAbstract(7500)
        };
        System.out.println(totalTax(incomes));
    }
}