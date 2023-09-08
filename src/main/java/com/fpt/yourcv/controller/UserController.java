package com.fpt.yourcv.controller;

import com.fpt.yourcv.service.implement.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    @GetMapping("/")
    public ResponseEntity<?> getUsers(){
        return new ResponseEntity<>(userServiceInterface.getUsers(), HttpStatus.OK);
    }
}
