package com.burakt.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @Entity
    @Table(name = "users")
    public class User extends BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "uname",length = 100,unique = true)
        private String username;

        @Column(name = "pwd",length = 200)
        private String password;

        @Column(name = "name_surname",length = 200)
        private String nameSurname;

        @Column(name = "email",length = 100)
        private String email;

        @JoinColumn(name = "assignee_user_id")
        @OneToMany(fetch = FetchType.LAZY)
        private List<Issue> issues;
    }


