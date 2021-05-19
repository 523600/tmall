package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manufacturer_brand")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer_brand {
    @Id
    private long id;

    private long manufacturerid;

    private long brandid;
}
