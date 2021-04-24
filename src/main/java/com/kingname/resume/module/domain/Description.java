package com.kingname.resume.module.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Description {

    @Id @GeneratedValue
    private Long id;

    @Lob @Basic(fetch = FetchType.EAGER)
    private String logo;

    @Column(nullable = false)
    private String title;
    private String description;
}
