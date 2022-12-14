package com.co.my_book_app.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    
}
