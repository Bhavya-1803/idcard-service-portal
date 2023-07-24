package com.myprojects.idcardservice.model;

import lombok.Data;

@Data
public class LoginDto {
    private int userId;
    private String password;
}
