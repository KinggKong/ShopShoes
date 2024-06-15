package org.example.assshoes.repository;

import org.example.assshoes.model.Shoe;
import org.example.assshoes.model.ShoeDetail;
import org.example.assshoes.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
    @Query("select s from ShoeDetail sd inner join Size s on sd.size.id =s.id where sd.code = ?1")
    List<Size> findAllByShoeDetailCode(String code);
}
