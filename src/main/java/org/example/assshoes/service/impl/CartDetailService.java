package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.model.Cart;
import org.example.assshoes.model.CartDetail;
import org.example.assshoes.model.ShoeDetail;
import org.example.assshoes.repository.AccountRepository;
import org.example.assshoes.repository.CartDetailRepository;
import org.example.assshoes.repository.CartRepository;
import org.example.assshoes.service.ICartDetailService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartDetailService implements ICartDetailService {
    CartDetailRepository cartDetailRepository;
    CartRepository cartRepository;
    ShoeDetailService shoeDetailService;
    AccountRepository accountRepository;

    @Override
    public List<CartDetail> getCartDetailsByCartId(long cartId) {
        return List.of();
    }

    @Override
    public CartDetail getCartDetailById(Long cartId) {
        return cartDetailRepository.findById(cartId).orElse(null);
    }


    @Override
    public void addCartDetail(AccountDTO accountDTO, CartDetail cartDetail, Long shoeDetailId) {
        ShoeDetail shoeDetail = shoeDetailService.getShoeDetail(shoeDetailId);
        Cart cart = cartRepository.findByAccount_IdAndStatus(accountDTO.getId(), "buying")
                .orElseGet(() -> {
                    Cart newCart = new Cart();
                    newCart.setAccount(accountRepository.findById(accountDTO.getId()).orElse(null));
                    newCart.setStatus("buying");
                    return cartRepository.save(newCart);
                });

        CartDetail existingCartDetail = cartDetailRepository.findByShoeDetail_Id(shoeDetailId);
        if (existingCartDetail != null) {
            existingCartDetail.setQuantity(existingCartDetail.getQuantity() + 1);
            cartDetail = existingCartDetail;
        } else {
            cartDetail.setQuantity(1);
            cartDetail.setCart(cart);
            cartDetail.setShoeDetail(shoeDetail);
        }
        cartDetailRepository.save(cartDetail);
    }


    @Override
    public void updateCartDetail(CartDetail cartDetail) {

    }

    @Override
    public void deleteCartDetail(CartDetail cartDetail) {

    }

    @Override
    public List<CartDetail> findByCart(Long cartId) {
        return cartDetailRepository.findByCart_Id(cartId);
    }

}
