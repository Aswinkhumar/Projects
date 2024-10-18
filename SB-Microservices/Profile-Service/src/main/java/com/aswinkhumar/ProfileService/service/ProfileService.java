package com.aswinkhumar.ProfileService.service;

import com.aswinkhumar.ProfileService.DTO.ProfileDTO;
import com.aswinkhumar.ProfileService.Entity.Profile;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProfileService {
    List<ProfileDTO> getAllProfile();

    ProfileDTO getProfileById(int id);

    ProfileDTO addProfile(Profile profile);
}
