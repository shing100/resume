package com.kingname.resume.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Description {

    @Id @GeneratedValue
    private Long id;

    @Lob
    private String logo;

    private String title;
    private String description;
}
