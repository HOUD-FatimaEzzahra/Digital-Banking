package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<Account,String> {
}
