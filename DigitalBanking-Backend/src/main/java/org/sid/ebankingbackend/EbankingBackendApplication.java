package org.sid.ebankingbackend;


import org.sid.ebankingbackend.dtos.CustomerDTO;
import org.sid.ebankingbackend.repositories.AccountOperationRepository;
import org.sid.ebankingbackend.repositories.BankAccountRepository;
import org.sid.ebankingbackend.repositories.CustomerRepository;
import org.sid.ebankingbackend.services.BankAccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EbankingBackendApplication {


    public static void main(String[] args) {
        SpringApplication.run(EbankingBackendApplication.class, args);
    }


}
