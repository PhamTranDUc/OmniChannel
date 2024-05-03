package com.hum.chatapp.repository;

import com.hum.chatapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(String id);

    @Query("SELECT u FROM User u WHERE u.id <> ?1")
    List<User> findAllUsersExceptThisUserId(String id);
}
