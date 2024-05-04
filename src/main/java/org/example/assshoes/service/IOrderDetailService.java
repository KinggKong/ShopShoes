package org.example.assshoes.service;

import org.example.assshoes.dto.OrderDetailDTO;
import org.example.assshoes.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO orderDetailDTO);

    List<OrderDetail> getAllOrderDetails();

    OrderDetail updateOrderDetail(OrderDetailDTO orderDetailDTO);

    void deleteOrderDetail(Long orderDetailID);
}
