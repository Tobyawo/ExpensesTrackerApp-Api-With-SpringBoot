package com.ExpenseTrackerApi.Controller;

import com.ExpenseTrackerApi.Model.Expense;
import com.ExpenseTrackerApi.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("expenses")
    @ResponseBody
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpense();}




    @PostMapping("new")
    @ResponseBody
    public void addNewExpenses(@RequestBody Expense expense){

        System.err.println(expense.getExpenseAmount());
        System.err.println(expense.getTitle());
        System.err.println(expense.getDate());
        expenseService.addNew(expense);}
}



