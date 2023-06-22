package com.pracise.security.springsecuritypractise.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentRequest {

    private String email;
    private String password;

}
