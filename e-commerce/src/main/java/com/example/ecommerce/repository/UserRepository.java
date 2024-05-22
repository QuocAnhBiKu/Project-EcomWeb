package com.example.ecommerce.repository;

import com.example.ecommerce.entity.User;
import com.example.ecommerce.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);
}
