package org.example.assshoes.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.assshoes.model.Category;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private String name;

    float price;

    private String image;

    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    private boolean available;

    private Long categoryID;
}
