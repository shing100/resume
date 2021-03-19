package com.kingname.resume.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Setter @Getter @ToString
@EqualsAndHashCode(of = "id")
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String nickname;

    private String password;

    private boolean emailVerified;

    private String emailCheckToken;
    private LocalDateTime emailCheckTokenGeneratedAt;
    private LocalDateTime joinedAt;

    @Lob @Basic(fetch = FetchType.EAGER)
    private String profileImage;

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

    public void generateEmailCheckToken() {
        this.emailCheckToken = UUID.randomUUID().toString();
        this.emailCheckTokenGeneratedAt = LocalDateTime.now();
    }

    public void completeSignUp() {
        this.emailVerified = true;
        this.joinedAt = LocalDateTime.now();
    }

    public boolean isValidToken(String token) {
        return this.emailCheckToken.equals(token);
    }

    public boolean canSendConfirmEmail() {
        return this.emailCheckTokenGeneratedAt.isBefore(LocalDateTime.now().minusHours(1));
    }

}
