package com.aswinkhumar.ProfileService.service;

import com.aswinkhumar.ProfileService.DTO.ProfileDTO;
import com.aswinkhumar.ProfileService.DTO.UserDTO;
import com.aswinkhumar.ProfileService.Entity.Profile;
import com.aswinkhumar.ProfileService.Repository.ProfileRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ProfileDTO> getAllProfile() {
        List<Profile> result = profileRepository.findAll();
        return result.stream()
                .map(profile -> modelMapper.map(profile,ProfileDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProfileDTO getProfileById(int id) {
        Optional<Profile> profile = profileRepository.findById(id);
        if(profile.isPresent()){
            UserDTO userDTO = restTemplate.getForObject("http://USER-SERVICE/user/"+profile.get().getUserId(), UserDTO.class);
            ProfileDTO profileDTO = modelMapper.map(profile,ProfileDTO.class);
            profileDTO.setUserDTO(userDTO);
            return profileDTO;
        }
        return null;
    }

    @Override
    public ProfileDTO addProfile(Profile profile) {
        Profile savedProfile = profileRepository.save(profile);
        return modelMapper.map(savedProfile,ProfileDTO.class);
    }
}
