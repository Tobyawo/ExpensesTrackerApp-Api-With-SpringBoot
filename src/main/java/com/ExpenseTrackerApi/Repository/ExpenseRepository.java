package com.ExpenseTrackerApi.Repository;

import com.ExpenseTrackerApi.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
