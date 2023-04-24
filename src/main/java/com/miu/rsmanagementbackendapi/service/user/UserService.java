package com.miu.rsmanagementbackendapi.service.user;

import com.miu.rsmanagementbackendapi.domain.user.User;
import com.miu.rsmanagementbackendapi.domain.user.request.UserDTO;
import com.miu.rsmanagementbackendapi.domain.user.response.UserResponse;
import com.miu.rsmanagementbackendapi.domain.user.response.Users;

import java.util.Optional;

public interface UserService {

    Users getAllUsers();

    Optional<UserResponse> getUser(Long id);

    UserResponse saveUser(UserDTO userDTO);

    Boolean deleteUser(Long userId);

}
