package com.pracise.security.springsecuritypractise.controller;

import com.pracise.security.springsecuritypractise.Entity.EmployeEntity;
import com.pracise.security.springsecuritypractise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    public final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<EmployeEntity>> getAllEmployees(){
    return new ResponseEntity<>(employeeService.getEmployees(),HttpStatus.OK);
    }

    @GetMapping("/{empID}")
    public ResponseEntity<EmployeEntity> getEmployee(@PathVariable("empID") int id){
        return new ResponseEntity<>(employeeService.getEmployee(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmployeEntity> insertEmployee(@RequestBody EmployeEntity employeEntity){
        return  new ResponseEntity<>(employeeService.insertEmployee(employeEntity),HttpStatus.CREATED);
    }

    @PutMapping("/{empID}")
    public ResponseEntity<EmployeEntity> updateEmployee(@PathVariable("empID") int id,@RequestBody EmployeEntity employeEntity){
        return new ResponseEntity<>(employeeService.updateEmployee(id,employeEntity),HttpStatus.OK);
    }

    @DeleteMapping("/{empID}")
    public void deleteEmployee(@PathVariable("empId") int id){
        employeeService.deleteEmployee(id);
    }
}
