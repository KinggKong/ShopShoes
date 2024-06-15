package org.example.assshoes.repository;

import org.example.assshoes.model.Cart;
import org.example.assshoes.model.CartDetail;
import org.example.assshoes.model.ShoeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    CartDetail findByShoeDetail_Id(Long shoeDetailId);

    List<CartDetail> findByCart_Id(Long cartId);


}
