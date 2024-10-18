package com.aswinkhumar.SpringSecurity.Repository;

import com.aswinkhumar.SpringSecurity.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findByUserName(String username);
}
