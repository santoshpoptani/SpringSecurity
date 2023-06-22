package com.pracise.security.springsecuritypractise;

import com.pracise.security.springsecuritypractise.entity.Student;
import com.pracise.security.springsecuritypractise.repository.StudentRepository;
import com.pracise.security.springsecuritypractise.security.PasswordConfig;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringSecurityPractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityPractiseApplication.class, args);
    }



}
