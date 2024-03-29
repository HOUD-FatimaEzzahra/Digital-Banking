package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<Operation,Long> {
  List<Operation> findByBankAccountId(String accountId);
  Page<Operation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
