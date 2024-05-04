package org.example.assshoes.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailDTO {

    private Long orderID;

    private Long productID;

    private float price;

    private int quantity;
}
