package com.myprojects.idcardservice.controller;

import com.myprojects.idcardservice.model.LoginDto;
import com.myprojects.idcardservice.service.EmployeeServiceImpl;
import com.myprojects.idcardservice.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @PostMapping("/signin")
    public ResponseEntity<String> signin(@RequestBody LoginDto loginDto){
        int userId = loginDto.getUserId();
        if(employeeService.findEmployeeByNo(userId)!=null && loginDto.getPassword().equals("password"))
        {
            return new ResponseEntity<>("User login successful", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User does not exist", HttpStatus.BAD_REQUEST);
        }
    }
}
