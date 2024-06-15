package org.example.assshoes.repository;

import org.example.assshoes.model.Account;
import org.example.assshoes.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByAccount_IdAndStatus(Long accountID, String status);
}
