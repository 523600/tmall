package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Product")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id=1;

    private Date create_time;

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
