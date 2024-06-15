package org.example.assshoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
public class Role {
    @Id
    int id;

    String name;

    boolean status;

    public static String ADMIN = "ADMIN";
    public static String USER = "USER";
}
