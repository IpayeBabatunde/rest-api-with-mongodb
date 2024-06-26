package com.ipaye.rest_api_with_mongodb.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.ipaye.rest_api_with_mongodb.model.Expense;
import com.ipaye.rest_api_with_mongodb.model.ExpenseCategory;
import com.ipaye.rest_api_with_mongodb.repository.ExpenseRepository;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.ipaye.rest_api_with_mongodb.model.ExpenseCategory.*;

@ChangeLog(order="001")
public class DatabaseChangeLog {

    @ChangeSet(order = "001", id="seedDataBase", author="ipaye")
    public void seedDatabase(ExpenseRepository expenseRepository) {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("Movie Tickets", ENTERTAINMENT, BigDecimal.valueOf(40)));
        expenseList.add(createNewExpense("Dinner", RESTAURANT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Netflix", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Gym", MISC, BigDecimal.valueOf(20)));
        expenseList.add(createNewExpense("Internet", UTILITY, BigDecimal.valueOf(30)));

        expenseRepository.insert(expenseList);

    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal amount) {
    Expense expense = new Expense();
    expense.setExpenseName(expenseName);
    expense.setExpenseAmount(amount);
    expense.setExpenseCategory(expenseCategory);
    return expense;
    }

}
