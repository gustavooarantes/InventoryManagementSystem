package com.gustavooarantes.inventorymanagement.repositories;

import com.gustavooarantes.inventorymanagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserLogin(String login);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.userLevel = :userLevel WHERE u.userId = :userId")
    void updateUserLevel(@Param("userLevel") String userLevel, @Param("userId") String userId);
}
