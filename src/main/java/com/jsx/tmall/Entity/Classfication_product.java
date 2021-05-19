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

    @Id
    private long id;

    private String classfication;

    private long product_id;
}
