package com.gustavooarantes.inventorymanagement.services;

import com.gustavooarantes.inventorymanagement.models.User;
import com.gustavooarantes.inventorymanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Generates random ID
    public String generateUniqueId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 25).toUpperCase();
    }

    // Generates user's login
    public String generateUserLogin(String userName) {
        String combinedName = userName.trim().replaceAll("\\s", "");

        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000);

        return combinedName + randomNumber;
    }

    // Creates a new user
    public User createNewUser(User user) {
        user.setUserId(generateUniqueId());
        String login;
        do {
            login = generateUserLogin(user.getUserName());
        } while (userRepository.findByUserLogin(login).isPresent());
        user.setUserLogin(login);
        return userRepository.save(user);
    }

    // List all existing users
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    // Find user by ID
    public User findUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    // Update user's level
    public void updateUserLevel (String level, String id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.updateUserLevel(level, id);
    }
}
