package com.example.jobPortal.repository;

import com.example.jobPortal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users , Integer> {

    Optional<Users> findByEmail(String email);
}
