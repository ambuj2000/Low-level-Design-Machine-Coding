package Splitwise_LLD.Expense;


import Splitwise_LLD.BalanceSheetController;
import Splitwise_LLD.Expense.Split.ExpenseSplit;
import Splitwise_LLD.Expense.Split.Split;
import Splitwise_LLD.User.User;

import java.util.List;

public class ExpenseController {


    BalanceSheetController balanceSheetController;
    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, User paidByUser, double amount, String description,
                                 List<Split> splitDetails, ExpenseSplitType splitType) {


        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, amount);

        Expense expense = new Expense(expenseId, amount, description, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, amount);
        return expense;

    }
}
