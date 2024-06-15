package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Cart;
import org.example.assshoes.repository.CartRepository;
import org.example.assshoes.service.ICartService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartService implements ICartService {
    CartRepository cartRepository;

    @Override
    public void addCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void removeCart(Cart cart) {
        cartRepository.delete(cart);
    }


    @Override
    public Cart getCartByCustomerId(Long customerId) {
        return cartRepository.findByAccount_IdAndStatus(customerId, "buying").orElse(null);
    }

    @Override
    public void updateCart(Cart cart) {
        cartRepository.save(cart);
    }
}
