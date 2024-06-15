package org.example.assshoes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDTO {
    Long id;
    String username;

//    String password;

    String name;

    String email;

    String phonenumber;

    String avatar;

    Boolean status;

    int roleID;
}
