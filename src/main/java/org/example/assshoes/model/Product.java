package org.example.assshoes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 5, message = "Product's name must be > 5 characters")
    private String name;

    @Min(value = 0, message = "Price must be >= 0")
    float price;

    private String image;
    @Min(value = 0, message = "Product's quantity must be >=0")
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    private boolean available;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
