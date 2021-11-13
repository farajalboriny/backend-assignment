package com.invoiceq.assignment.web;

import com.invoiceq.assignment.Model.User;
import com.invoiceq.assignment.service.UserService;
import com.invoiceq.assignment.service.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    ValidatorService validatorService;
    @PostMapping(
            value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> registration(@RequestBody User user) {
        if(validatorService.validate(user)) {
            userService.save(user);
            return ResponseEntity.ok().body(user);
        }
        return ResponseEntity.badRequest().build();
    }
}
