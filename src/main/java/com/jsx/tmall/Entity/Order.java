package com.jsx.tmall.Entity;

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
    @SequenceGenerator(name = "generator", sequenceName = "SEQ_SYS_ORG_NODE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Id
    private long id;

    private Date date;

    private int cost;

    private String shop_name;  //

    private String customer_name;

    private String status;

}
