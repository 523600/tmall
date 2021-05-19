package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="User")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private long id;

    private String name;

    private String email;

    private String phone;

    private int wallet;

    private Date join_date;

}
