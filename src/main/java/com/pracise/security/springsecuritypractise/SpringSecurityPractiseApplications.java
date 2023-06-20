package com.pracise.security.springsecuritypractise;

import com.pracise.security.springsecuritypractise.Entity.EmployeEntity;
import com.pracise.security.springsecuritypractise.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityPractiseApplications {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityPractiseApplications.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, PasswordEncoder passwordEncoder) {

        return args -> {
            EmployeEntity employeEntity = new EmployeEntity(
                    "man@hello.com",
                    passwordEncoder.encode("123")
            );
            employeeRepository.save(employeEntity);
        };
    }
}
