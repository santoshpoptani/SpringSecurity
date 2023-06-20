package com.pracise.security.springsecuritypractise.Repository;

import com.pracise.security.springsecuritypractise.Entity.EmployeEntity;
import com.pracise.security.springsecuritypractise.security.UserDetailServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeEntity, Long> {

    //@Query("update Employee em set em.name")
    //public EmployeEntity updateEmploye(int id);
//
 public Optional<EmployeEntity> findEmployeEntitiesByEmail(String email);


}
