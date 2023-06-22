package com.pracise.security.springsecuritypractise.service;

import com.pracise.security.springsecuritypractise.entity.Student;
import com.pracise.security.springsecuritypractise.entity.StudentUserDetails;
import com.pracise.security.springsecuritypractise.repository.StudentRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private  final StudentRepository studentRepository;

    public UserDetailServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Student student = studentRepository.findStudentByEmail(email)
                .orElseThrow();
        return  new StudentUserDetails(student);
    }
}
