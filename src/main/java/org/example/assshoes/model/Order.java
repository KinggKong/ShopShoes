package org.example.assshoes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fullname;

    private String phone_number;
    @Email
    private String email;

    private String address;

    private String note;

    @Temporal(TemporalType.DATE)
    private Date order_date;

    @Min(value = 0, message = "Order's total money must be >=0 ")
    private float total_money;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
