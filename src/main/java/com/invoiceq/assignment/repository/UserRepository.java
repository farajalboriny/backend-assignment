package com.invoiceq.assignment.repository;

import com.invoiceq.assignment.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}