package org.example.assshoes.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cartdetail")
public class CartDetail extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "shoedetailid")
    ShoeDetail shoeDetail;

    int quantity;

    @ManyToOne
    @JoinColumn(name = "cartid")
    Cart cart;
}
