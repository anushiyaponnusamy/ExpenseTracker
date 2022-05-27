package com.expense.tracker.springapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.tracker.springapplication.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}