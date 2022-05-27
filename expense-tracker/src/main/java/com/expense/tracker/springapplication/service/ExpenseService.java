package com.expense.tracker.springapplication.service;

import java.util.List;

import com.expense.tracker.springapplication.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
	Expense save(Expense expense);
	Expense findById(Long id);
	void delete(Long id);
	
}
