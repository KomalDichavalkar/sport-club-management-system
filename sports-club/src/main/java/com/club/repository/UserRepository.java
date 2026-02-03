package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.club.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	User findByResetOtp(String resetOtp);
}