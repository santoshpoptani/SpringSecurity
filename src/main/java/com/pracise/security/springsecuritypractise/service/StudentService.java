package com.pracise.security.springsecuritypractise.service;

import com.pracise.security.springsecuritypractise.entity.Student;
import com.pracise.security.springsecuritypractise.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private final PasswordEncoder passwordEncoder;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        Student stu = new Student();
        stu.setEmail(student.getEmail());
        stu.setUsername(student.getUsername());
        stu.setPassword(passwordEncoder.encode(student.getPassword()));
        return studentRepository.save(stu);
    }
}
