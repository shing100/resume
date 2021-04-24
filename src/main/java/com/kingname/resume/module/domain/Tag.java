package com.kingname.resume.module.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Tag {

    @Id @GeneratedValue
    private Long id;

    private String title;
}
