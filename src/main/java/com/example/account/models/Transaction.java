package com.example.account.models;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Transaction {

    @Getter
    @Setter
    private @Id @GeneratedValue Long id;

    @Getter
    @Setter
    private Long accountId;

    @Getter
    @Setter
    private Instant timestamp;

    @Getter
    @Setter
    private BigDecimal amount;
}