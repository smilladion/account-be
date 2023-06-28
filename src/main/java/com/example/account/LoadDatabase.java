package com.example.account;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.account.models.Account;
import com.example.account.repositories.AccountRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AccountRepository repository) {

        return args -> {
            log.info("Preloading "
                    + repository.save(new Account("Savings", "John Doe", new BigDecimal(50361.21), "DKK")));
            log.info("Preloading "
                    + repository.save(new Account("Bills and expenses", "John Doe", new BigDecimal(12053.55), "DKK")));
            log.info("Preloading "
                    + repository.save(new Account("Holiday fund", "John Doe", new BigDecimal(27600.80), "DKK")));
        };
    }
}
