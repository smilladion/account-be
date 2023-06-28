package com.example.account.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.account.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
