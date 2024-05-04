package org.example.assshoes.dto;


import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private String fullname;

    private String phone_number;
    @Email
    private String email;

    private String address;

    private String note;

    @Temporal(TemporalType.DATE)
    private Date order_date;

    private float total_money;

    private Long userID;
}
