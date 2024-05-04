package org.example.assshoes.dto;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    @Size(min = 5, message = "User's fullname must be > 5 characters")
    private String fullname;

    private String phone_number;
    @Size(min = 8, message = "User's fullname must be >= 8 characters")
    private String password;

    private String address;

    @Email(message = "sai dinh dang email")
    private String email;

    @Temporal(TemporalType.DATE)
    private Date date_of_birth;

    private boolean active;

    private boolean role;
}
