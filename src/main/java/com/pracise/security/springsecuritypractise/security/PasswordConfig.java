package com.pracise.security.springsecuritypractise.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Configuration
public class PasswordConfig {
    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder(5);
    }
}
