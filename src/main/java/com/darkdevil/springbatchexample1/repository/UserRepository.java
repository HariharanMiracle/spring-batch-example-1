package com.darkdevil.springbatchexample1.repository;

import com.darkdevil.springbatchexample1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}