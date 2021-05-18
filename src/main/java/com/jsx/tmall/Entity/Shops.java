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
    @SequenceGenerator(name = "generator", sequenceName = "SEQ_SYS_ORG_NODE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Id
    private long id;

    private String name;

    private String email;

    private Date establish;

    private int current_balance;

    private String area;

}
