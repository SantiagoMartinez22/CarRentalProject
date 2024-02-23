package com.SantiagoSpringProject.Car_Rental_Spring.entity;

import com.SantiagoSpringProject.Car_Rental_Spring.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="users" )
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
}
