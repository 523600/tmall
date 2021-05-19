package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Customer")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private long id;

    private String name;

    private String email;

    private String phone;

    private int wallet;

    private Date join_date;
}
