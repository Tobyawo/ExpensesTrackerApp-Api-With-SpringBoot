package com.ExpenseTrackerApi.Service;

import com.ExpenseTrackerApi.Model.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExpenseService {
    List<Expense> getAllExpense();

    void addNew(Expense expense);
}
