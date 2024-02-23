package com.SantiagoSpringProject.Car_Rental_Spring.repository;


import com.SantiagoSpringProject.Car_Rental_Spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findFirstByEmail(String email);
}
