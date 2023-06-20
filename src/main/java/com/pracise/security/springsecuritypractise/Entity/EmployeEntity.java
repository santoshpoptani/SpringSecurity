package com.pracise.security.springsecuritypractise.Entity;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity(name = "Employee")
@Table(name = "employee")
public class EmployeEntity implements UserDetails  {

    @Id
    @SequenceGenerator(
            name = "employeesequence",
            sequenceName = "employeesequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employeesequence"
    )

    @Column(
            name = "id",
            updatable = false,
            nullable = false
    )
    private Long id;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String password;

    public EmployeEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
