package com.example.account.models;

import java.util.List;

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
    private String user;

    @Getter
    @Setter
    private float balance;

    @Getter
    @Setter
    private String currency;
}
