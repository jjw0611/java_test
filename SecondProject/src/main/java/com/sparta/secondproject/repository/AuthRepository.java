package com.sparta.secondproject.repository;

import com.sparta.secondproject.Entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    Auth findByUserId(Long userId);
}
