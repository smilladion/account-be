package com.example.account;

import java.math.BigDecimal;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.account.models.Account;
import com.example.account.models.Transaction;
import com.example.account.repositories.AccountRepository;
import com.example.account.repositories.TransactionRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AccountRepository accountRepository, TransactionRepository transactionRepository) {

        Account account1 = new Account("Savings", "John Doe", new BigDecimal(50361.21), "DKK");
        Account account2 = new Account("Bills and expenses", "John Doe", new BigDecimal(12053.55), "DKK");
        Account account3 = new Account("Holiday fund", "John Doe", new BigDecimal(27600.80), "DKK");

        return args -> {
            log.info("Preloading "
                    + accountRepository.save(account1));
            log.info("Preloading "
                    + accountRepository.save(account2));
            log.info("Preloading "
                    + accountRepository.save(account3));

            log.info("Preloading "
                    + transactionRepository.save(new Transaction(Instant.now(), new BigDecimal(300.0), account1)));
            log.info("Preloading "
                    + transactionRepository.save(new Transaction(Instant.now(), new BigDecimal(1000.0), account1)));
            log.info("Preloading "
                    + transactionRepository.save(new Transaction(Instant.now(), new BigDecimal(-400), account1)));
        };
    }
}
