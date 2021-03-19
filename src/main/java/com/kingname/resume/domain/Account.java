package com.kingname.resume.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter @Getter @ToString
@EqualsAndHashCode(of = "id")
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Lob
    private String avatarImage;

    @Column(nullable = false)
    private String name;
    private String job;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    private String githubUrl;
    private String twitterUrl;
    private String facebookUrl;
    private String instagramUrl;

    @OneToMany
    private List<Description> descriptionList;

    @OneToMany
    private List<Experience> educationList;

}
