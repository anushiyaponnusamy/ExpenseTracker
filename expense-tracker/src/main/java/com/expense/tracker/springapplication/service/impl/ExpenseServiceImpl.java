package com.expense.tracker.springapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.tracker.springapplication.model.Expense;
import com.expense.tracker.springapplication.repository.ExpenseRepository;
import com.expense.tracker.springapplication.service.ExpenseService;




@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		return expenseRepository.findAll();
	}


	@Override
	public Expense save(Expense expense) {
		expenseRepository.save(expense);
		return expense;
	}

	@Override
	public Expense findById(Long id) {
		
		if(expenseRepository.findById(id).isPresent()) {
			return expenseRepository.findById(id).get();
		}
		return null;
	}


	@Override
	public void delete(Long id) {
		Expense expense=findById(id);
		expenseRepository.delete(expense);
		
	}



}
