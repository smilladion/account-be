package com.example.account.models;

import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Transaction {

    @Getter
    @Setter
    private @Id @GeneratedValue Long id;

    @Getter
    @Setter
    private Instant timestamp;

    @Getter
    @Setter
    private BigDecimal amount;

    @Getter
    @Setter
    @ManyToOne(optional = false)
    @JsonIgnore
    private Account account;

    public Transaction () {}

    public Transaction(Instant timestamp, BigDecimal amount, Account account) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.account = account;
    }
}