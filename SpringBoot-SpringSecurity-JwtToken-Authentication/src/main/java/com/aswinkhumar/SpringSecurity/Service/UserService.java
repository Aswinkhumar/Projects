package com.aswinkhumar.SpringSecurity.Service;

import com.aswinkhumar.SpringSecurity.Model.Users;
import com.aswinkhumar.SpringSecurity.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
    public List<Users> getAllUser(){
        return repository.findAll();
    }
    public Users registerUser(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }
}
