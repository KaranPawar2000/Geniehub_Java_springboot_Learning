package com.karan.spring_sec_demo.dao;

import com.karan.spring_sec_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
