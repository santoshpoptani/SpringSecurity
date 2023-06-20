package com.pracise.security.springsecuritypractise.security;

import com.pracise.security.springsecuritypractise.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailServiceImpl implements UserDetailsService {

    private final  EmployeeRepository employeeRepository;
    @Autowired
    public UserDetailServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return employeeRepository.findEmployeEntitiesByEmail(username)
                .orElseThrow(()->
                        new UsernameNotFoundException(String.format("username %s not found",username)));
    }
}
