package com.aswinkhumar.ProfileService.controller;

import com.aswinkhumar.ProfileService.DTO.ProfileDTO;
import com.aswinkhumar.ProfileService.Entity.Profile;
import com.aswinkhumar.ProfileService.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    @GetMapping
    public ResponseEntity<List<ProfileDTO>> getAllProfile(){
        List<ProfileDTO> result = profileService.getAllProfile();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProfileDTO> getProfileById(@PathVariable int id){
        ProfileDTO profile = profileService.getProfileById(id);
        return new ResponseEntity<>(profile,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<ProfileDTO> addProfile(@RequestBody Profile profile){
        ProfileDTO profileDTO = profileService.addProfile(profile);
        return new ResponseEntity<>(profileDTO,HttpStatus.CREATED);
    }
}
