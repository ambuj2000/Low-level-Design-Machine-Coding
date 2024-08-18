package Splitwise_LLD.Expense;


import Splitwise_LLD.Expense.Split.EqualExpenseSplit;
import Splitwise_LLD.Expense.Split.ExpenseSplit;
import Splitwise_LLD.Expense.Split.PercentageExpenseSplit;
import Splitwise_LLD.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                return null;
            }
        }
    }
}
