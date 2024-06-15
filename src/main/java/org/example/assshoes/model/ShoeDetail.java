package org.example.assshoes.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "shoedetail")
public class ShoeDetail  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "ShoeID")
    Shoe shoe;

    @ManyToOne
    @JoinColumn(name = "ColorID")
    Color color;

    @ManyToOne
    @JoinColumn(name = "SizeID")
    Size size;

    String name;

    Double price;

    String code;

    int quantity;

    Boolean status;

    String description;

}
