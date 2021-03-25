package TestPackage;

/**
 * 用抽象类给一个有工资收入和稿费收入的小伙伴算税。
 */
public class Demo_objectAbstract {
    public static void main(String[] args) {
//        IncomeAbstract[] incomes = new IncomeAbstract[]{
//                new IncomeAbstract(3000),
//                new IncomeAbstract(7500),
//                new ContributionFeeAbstract(10500)
//        };
//        System.out.println(totalTax(incomes));
//        //TODO:抽象
//        public static double totalTax(Income... incomes) {
//            double total = 0;
//            for (Income income : incomes) {
//                total = total + income.getTax();
//            }
//            return total;
//        }


    }
}

abstract class IncomeAbstract {
    protected double income;


    public IncomeAbstract(double income) {
        this.income = income;
    }

    public abstract double getTax();
//    public double getTax() {
//        return income * 0.1; // 税率10%
//    }
}

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


class ContributionFeeAbstract extends IncomeAbstract {
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