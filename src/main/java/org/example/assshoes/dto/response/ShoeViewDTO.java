package org.example.assshoes.dto.response;

import lombok.*;
import org.example.assshoes.model.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoeViewDTO {
    Long id;
    String name;
    Double price;
    String code;
    String thumbnailURL;

    public static ShoeViewDTO fromShoeDetail(ShoeDetail shoeDetail) {
        return ShoeViewDTO.builder()
                .id(shoeDetail.getId())
                .name(shoeDetail.getName())
                .price(shoeDetail.getPrice())
                .code(shoeDetail.getCode())
                .build();
    }
}
