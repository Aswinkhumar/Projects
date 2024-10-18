package com.aswinkhumar.UserService.Service;

import com.aswinkhumar.UserService.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    User addUser(User user);
}
