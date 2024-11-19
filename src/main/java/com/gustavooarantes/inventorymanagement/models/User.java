package com.gustavooarantes.inventorymanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_login", unique = true, nullable = false)
    private String userLogin;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "user_level", nullable = false)
    private String userLevel; // admin or regular
}
