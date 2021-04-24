package com.kingname.resume.module.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString @Setter @Getter
@EqualsAndHashCode(of = "id")
public class Portfolio {

    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private PortfolioType portfolioType;

    private String url;

    @Lob
    private String image;
}
