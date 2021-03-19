package com.kingname.resume.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter @Getter @ToString
@EqualsAndHashCode(of = "id")
public class Experience {

    @Id @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private ExperienceType experienceType;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = true)
    private LocalDateTime endDate;

    @Column(nullable = false)
    private String title;

    private String location;

    private String organization;

    @Column(nullable = false)
    private String description;

    // TODO Github 연동하여 스킬 정보 가져오기
}
