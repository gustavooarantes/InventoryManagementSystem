package com.gustavooarantes.inventorymanagement.controllers;

import com.gustavooarantes.inventorymanagement.models.User;
import com.gustavooarantes.inventorymanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Create new user
    @PostMapping("/create")
    public ResponseEntity<User> createNewUser(@RequestBody User user) {
        try {
            User newUser = userService.createNewUser(user);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    // List all users
    @GetMapping
    public ResponseEntity<List<User>> listAllUsers() {
        return ResponseEntity.ok(userService.listAllUsers());
    }

    // Find user by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable String id) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    // Update user status
    @PutMapping("/update/{id}/{level}")
    public ResponseEntity<Void> updateUserStatus(@PathVariable String level, @PathVariable String id) {
        userService.updateUserLevel(level, id);
        return ResponseEntity.noContent().build();
    }
}
