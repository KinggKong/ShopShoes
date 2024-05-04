package org.example.assshoes.repository;

import org.example.assshoes.model.Category;
import org.example.assshoes.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Page<Product> findByCategory(Category category,Pageable pageable);

    Optional<Product> findById(Long id);
}
