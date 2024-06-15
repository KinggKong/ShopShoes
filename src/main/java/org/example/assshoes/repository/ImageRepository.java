package org.example.assshoes.repository;

import org.example.assshoes.model.Image;
import org.example.assshoes.model.ShoeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    @Query("SELECT i FROM Image i WHERE i.shoedetail.id = :shoedetailID AND i.mainimage != '' ")
    Optional<Image> findByShoedetailIdAndMainimageExists(long shoedetailID);

    List<Image> findByShoedetailId(Long shoedetailID);
}
