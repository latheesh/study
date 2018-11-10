package com.latheesh.study.user.repository;

import com.latheesh.study.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
