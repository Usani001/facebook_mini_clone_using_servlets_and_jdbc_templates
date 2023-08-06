package com.facebookclonemini.service.implementation;

import com.facebookclonemini.dto.UserDTO;
import com.facebookclonemini.models.User;
import com.facebookclonemini.service.UserServices;

public class UserImpl implements UserServices {
    @Override
    public void signUp(User user,UserDTO userDTO) {
       userDTO.userDetails(user);

    }
}
