package com.example.account.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.exceptions.AccountNotFoundException;
import com.example.account.models.Account;
import com.example.account.repositories.AccountRepository;

@CrossOrigin
@RestController
public class AccountController {

    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/accounts")
    public List<Account> getAll() {
        return repository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Account getSingle(@PathVariable Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new AccountNotFoundException(id));
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody Account newAccount) {
        return repository.save(newAccount);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
