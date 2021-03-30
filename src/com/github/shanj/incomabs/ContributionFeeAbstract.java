package com.github.shanj.incomabs;


class ContributionFeeAbstract extends Income {
    //稿费
    public ContributionFeeAbstract(double income) {
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