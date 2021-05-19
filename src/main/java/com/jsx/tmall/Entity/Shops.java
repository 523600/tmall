package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Shops")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shops {

    @Id
    private long id;

    private String name;

    private String email;

    private Date establish;

    private int current_balance;

    private String area;

}
