package org.example.assshoes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String fullname;

    private String phone_number;


    private String password;

    private String address;

    private String email;

    @Temporal(TemporalType.DATE)
    private Date date_of_birth;

    private boolean activated;

    private boolean role;
}
