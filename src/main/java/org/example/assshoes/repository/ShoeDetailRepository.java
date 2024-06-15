package org.example.assshoes.repository;

import org.example.assshoes.model.ShoeDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeDetailRepository extends JpaRepository<ShoeDetail, Long> {
    Page<ShoeDetail> findAll(Pageable pageable);
}
