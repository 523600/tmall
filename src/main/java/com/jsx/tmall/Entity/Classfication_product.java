package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Classfication_product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classfication_product {
    @SequenceGenerator(name = "generator", sequenceName = "SEQ_SYS_ORG_NODE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Id
    private long id;

    private String classfication;

    private long product_id;
}
