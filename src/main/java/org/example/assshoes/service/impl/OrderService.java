//package org.example.assshoes.service.impl;
//
//import org.example.assshoes.dto.OrderDTO;
//import org.example.assshoes.model.Order;
//import org.example.assshoes.repository.OrderReposittory;
//import org.example.assshoes.repository.AccountRepository;
//import org.example.assshoes.service.IOrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class OrderService implements IOrderService {
//    @Autowired
//    OrderReposittory orderReposittory;
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Override
//    public Order createOrder(OrderDTO orderDTO) {
//        Order order = Order.builder()
//                .fullname(orderDTO.getFullname())
//                .phone_number(orderDTO.getPhone_number())
//                .email(orderDTO.getEmail())
//                .address(orderDTO.getAddress())
//                .note(orderDTO.getNote())
//                .order_date(orderDTO.getOrder_date())
//                .user(accountRepository.findById(orderDTO.getUserID()).get())
//                .build();
//        return orderReposittory.save(order);
//    }
//
//    @Override
//    public List<Order> getAllOrders() {
//        return null;
//    }
//
//    @Override
//    public Order updateOrder(OrderDTO orderDTO) {
//        return null;
//    }
//
//    @Override
//    public void deleteOrder(Long orderID) {
//
//    }
//}
