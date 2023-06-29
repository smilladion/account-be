package com.example.account.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.account.models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    public List<Transaction> findByAccountId(Long accountId);
}
