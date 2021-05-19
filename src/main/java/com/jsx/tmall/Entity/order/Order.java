package com.jsx.tmall.Entity.order;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Order")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private long id;

    private Date date;

    private int cost;

    private String shop_name;  //

    private String customer_name;

    private String status;

}
