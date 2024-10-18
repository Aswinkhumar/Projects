package com.aswinkhumar.SpringSecurity.Controller;

import com.aswinkhumar.SpringSecurity.Model.Users;
import com.aswinkhumar.SpringSecurity.Service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {
    @Autowired
    private JWTService service;
    @PostMapping("/login")
    public String loginUser(@RequestBody Users user){
        return service.validateUser(user);
    }
}
