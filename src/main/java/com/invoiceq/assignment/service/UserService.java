package com.invoiceq.assignment.service;

import com.invoiceq.assignment.Model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}