package org.example.assshoes.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.model.Cart;
import org.example.assshoes.model.CartDetail;
import org.example.assshoes.service.impl.CartDetailService;
import org.example.assshoes.service.impl.CartService;
import org.example.assshoes.service.impl.ShoeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Optional;

@Controller
@RequestMapping("/carts")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CartController {
    CartDetailService cartDetailService;
    ShoeDetailService shoeDetailService;
    CartService cartService;

    @GetMapping("")
    public String index(@SessionAttribute("auth") AccountDTO accountDTO, Model model) {
        Cart cart = cartService.getCartByCustomerId(accountDTO.getId());
        if (cart != null) {
            model.addAttribute("cartdetails", cartDetailService.findByCart(cart.getId()));
        }
        return "home/cart";
    }

    @GetMapping("/{id}")
    public String add(@PathVariable("id") Optional<Long> shoeDetailId,
                      @SessionAttribute("auth") AccountDTO accountDTO) {
        CartDetail cartDetail = new CartDetail();
        cartDetailService.addCartDetail(accountDTO, cartDetail, shoeDetailId.get());
        return "home/cart";
    }
}
