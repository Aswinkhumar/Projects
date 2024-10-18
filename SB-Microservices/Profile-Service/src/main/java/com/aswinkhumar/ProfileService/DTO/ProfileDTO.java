package com.aswinkhumar.ProfileService.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDTO {

    private int id;
    private String profileName;
    private String profileBio;
    private UserDTO userDTO;
}
