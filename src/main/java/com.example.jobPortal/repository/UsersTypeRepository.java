package com.example.jobPortal.repository;

import com.example.jobPortal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersTypeRepository extends JpaRepository<UsersType , Integer> {


    Optional<UsersType> findByEmail(String  email);
}
