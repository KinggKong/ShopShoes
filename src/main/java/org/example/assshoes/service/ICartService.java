package org.example.assshoes.service;

import org.example.assshoes.model.Cart;

public interface ICartService {
    void addCart(Cart cart);

    void removeCart(Cart cart);

    Cart getCartByCustomerId(Long customerId);

    void updateCart(Cart cart);
}
