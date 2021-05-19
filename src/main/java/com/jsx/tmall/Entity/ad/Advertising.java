package com.jsx.tmall.Entity.ad;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Advertising")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Advertising {

    @Id
    private long id;

    private String name;

    private String source;

    private String description;

}
