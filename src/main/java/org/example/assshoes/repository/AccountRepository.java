package org.example.assshoes.repository;

import org.example.assshoes.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    boolean existsByEmail(String email);

    Account findByEmail(String email);
}
