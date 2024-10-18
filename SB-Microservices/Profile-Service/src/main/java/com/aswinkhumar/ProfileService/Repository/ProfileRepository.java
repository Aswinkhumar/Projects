package com.aswinkhumar.ProfileService.Repository;

import com.aswinkhumar.ProfileService.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
}
