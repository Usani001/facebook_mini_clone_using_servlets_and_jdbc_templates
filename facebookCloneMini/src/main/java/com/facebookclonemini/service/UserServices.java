package com.facebookclonemini.service;

import com.facebookclonemini.dto.UserDTO;
import com.facebookclonemini.models.User;

public interface UserServices {
    void signUp(User user, UserDTO userDTO);
}
