package com.invoiceq.assignment.Model;

import java.time.LocalDate;
import javax.persistence.*;
@Entity
@Table(name = "user_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private LocalDate birthDate;
    private String gender;


    public User(){

    }
    public User(String userName, String gender, LocalDate birthDate, String password) {
        this.username = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getPassword(){
        return password;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
