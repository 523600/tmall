package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @SequenceGenerator(name = "generator", sequenceName = "SEQ_SYS_ORG_NODE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Id
    private long id;

    private String name;

    private int price;

    private String invoice_id;   //fapiao

    private String status;

    private float discount;

    private int sales_volume;

    private String manufacturer;  //zhizaoshang

    private String brand;

    public Product(String name, int price, String manufacturer, String brand) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.brand = brand;
    }
}
