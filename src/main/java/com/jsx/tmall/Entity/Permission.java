package com.jsx.tmall.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Permission")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
    @SequenceGenerator(name = "generator", sequenceName = "SEQ_SYS_ORG_NODE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Id
    private long id;

    private String name;

    private int type;

    private  String code;

    private String description;

    private String pid;

    private String envisible;

    public Permission(String name, int type, String code, String description) {
        this.name = name;
        this.type = type;
        this.code = code;
        this.description = description;
    }
}
