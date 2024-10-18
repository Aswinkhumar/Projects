package com.aswinkhumar.SpringSecurity.Service;

import com.aswinkhumar.SpringSecurity.Model.Users;
import com.aswinkhumar.SpringSecurity.Utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class JWTService {
    @Autowired
    private JWTUtils utils;
    @Autowired
    AuthenticationManager authenticationManager;
    public String validateUser(Users user) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
        if(authentication.isAuthenticated()){
            return utils.generateToken(user.getUserName());
        }
        else {
            return "Login Failed";
        }

    }
}
