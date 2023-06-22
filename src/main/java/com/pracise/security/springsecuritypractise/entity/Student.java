package com.pracise.security.springsecuritypractise.entity;

import lombok.*;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Student")
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "username",nullable = false,columnDefinition = "TEXT")
    private String username;
    @Column(name = "email",nullable = false,columnDefinition = "TEXT")
    private String email;
    @Column(name = "password",nullable = false,columnDefinition = "TEXT")
    private String password;

    public Student(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
