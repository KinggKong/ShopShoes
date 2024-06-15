package org.example.assshoes.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Shoe")
public class Shoe extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    Category category;

    @ManyToOne
    @JoinColumn(name = "BrandID")
    Brand brand;

    @OneToMany(mappedBy = "shoe")
    List<ShoeDetail> shoeDetails;

}
