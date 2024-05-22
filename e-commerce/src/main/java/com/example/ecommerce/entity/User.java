package com.example.ecommerce.entity;

import com.example.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private UserRole role;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;
}
