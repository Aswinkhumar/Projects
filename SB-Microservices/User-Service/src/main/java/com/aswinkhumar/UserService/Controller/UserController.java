package com.aswinkhumar.UserService.Controller;

import com.aswinkhumar.UserService.Entity.User;
import com.aswinkhumar.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
