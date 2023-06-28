package com.example.account.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Account {

    @Getter
    @Setter
    private @Id @GeneratedValue Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private BigDecimal balance;

    @Getter
    @Setter
    private String currency;

    public Account() {}

    public Account(String name, String username, BigDecimal balance, String currency) {
        this.name = name;
        this.username = username;
        this.balance = balance;
        this.currency = currency;
    }
}
