package com.aswinkhumar.SpringSecurity.Service;

import com.aswinkhumar.SpringSecurity.Model.CustomUserDetails;
import com.aswinkhumar.SpringSecurity.Model.Users;
import com.aswinkhumar.SpringSecurity.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repository.findByUserName(username);
        if(user == null){
            System.out.println("No users found for userName: "+username);
            throw new UsernameNotFoundException("No User Found for UserName"+ username);
        }
        return new CustomUserDetails(user);
    }
}
