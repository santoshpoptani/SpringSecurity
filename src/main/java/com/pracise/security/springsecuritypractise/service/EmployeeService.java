package com.pracise.security.springsecuritypractise.service;

import com.pracise.security.springsecuritypractise.Entity.EmployeEntity;
import com.pracise.security.springsecuritypractise.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService  {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeEntity> getEmployees(){
        return employeeRepository.findAll();
    }

    public EmployeEntity getEmployee(int id){
        return employeeRepository.findById((long)id)
                .orElseThrow();
    }

    public EmployeEntity insertEmployee(EmployeEntity emp){
        return employeeRepository.save(emp);
    }
    public EmployeEntity updateEmployee(int id, EmployeEntity emp){
      return null;
    }

    public void deleteEmployee(int id){
        employeeRepository.deleteById((long)id);
    }
}
