package org.example.assshoes.service;

import org.example.assshoes.dto.OrderDTO;
import org.example.assshoes.model.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO);

    List<Order> getAllOrders();

    Order updateOrder(OrderDTO orderDTO);

    void deleteOrder(Long orderID);
}
