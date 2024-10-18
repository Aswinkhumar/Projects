package com.aswinkhumar.SpringSecurity.Controller;

import com.aswinkhumar.SpringSecurity.Model.Users;
import com.aswinkhumar.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/register")
    public Users addUser(@RequestBody Users user){
        return service.registerUser(user);
    }
    @GetMapping("/users")
    public List<Users> getAllUser(){
        return service.getAllUser();
    }
}
