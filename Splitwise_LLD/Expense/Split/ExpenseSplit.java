package Splitwise_LLD.Expense.Split;


import java.util.List;

public interface ExpenseSplit {
    public void validateSplitRequest(List<Split> splitList, double amount);
}


