package com.kingname.resume.module.recruit;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Recruit {

    @Id
    private Long id;

}
