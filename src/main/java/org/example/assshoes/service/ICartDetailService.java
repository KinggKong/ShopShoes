package org.example.assshoes.service;

import jakarta.servlet.http.HttpSession;
import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.model.CartDetail;
import org.example.assshoes.model.ShoeDetail;

import java.util.List;

public interface ICartDetailService {
    List<CartDetail> getCartDetailsByCartId(long cartId);

    CartDetail getCartDetailById(Long cartId);

    void addCartDetail(AccountDTO accountDTO, CartDetail cartDetail, Long shoeDetailId);

    void updateCartDetail(CartDetail cartDetail);

    void deleteCartDetail(CartDetail cartDetail);

    List<CartDetail> findByCart(Long cartId);
}
