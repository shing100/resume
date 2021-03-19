package com.kingname.resume.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter @Getter @ToString
@EqualsAndHashCode(of = "id")
public class Post {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Account account;

    private String title;
    private String description;

    private LocalDateTime createdDt;
    private LocalDateTime updateDt;
    private LocalDateTime deleteDt;

    @Lob
    private String image;

    @ManyToMany
    private Set<Tag> tags = new HashSet<>();
}
