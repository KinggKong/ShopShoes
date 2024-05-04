package org.example.assshoes.repository;

import org.example.assshoes.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReposittory extends JpaRepository<Order,Long> {
}
