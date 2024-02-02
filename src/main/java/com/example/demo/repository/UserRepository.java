package com.example.demo.repository;

import com.example.demo.entity.SignupReq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SignupReq, Integer> {
    Optional<SignupReq> findByName(String username);
}
