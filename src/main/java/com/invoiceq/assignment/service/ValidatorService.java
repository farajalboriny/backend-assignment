package com.invoiceq.assignment.service;

import com.invoiceq.assignment.Model.User;
import org.springframework.stereotype.Service;

import java.util.Calendar;
@Service
public class ValidatorService {

    public boolean validate(User user){
       if(user==null){
           System.out.println("null");
       }
        System.out.println(user.getUserName());
        return Calendar.getInstance().get(Calendar.YEAR)-user.getBirthDate().getYear()>20;
    }
}
