package com.miu.rsmanagementbackendapi.service.user.impl;

import com.miu.rsmanagementbackendapi.domain.user.User;
import com.miu.rsmanagementbackendapi.domain.user.request.UserDTO;
import com.miu.rsmanagementbackendapi.domain.user.response.UserResponse;
import com.miu.rsmanagementbackendapi.domain.user.response.Users;
import com.miu.rsmanagementbackendapi.repo.user.UserRepository;
import com.miu.rsmanagementbackendapi.service.user.UserService;
import com.miu.rsmanagementbackendapi.service.user.adapter.UserAdapter;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserAdapter adapter;

    @Override
    public Users getAllUsers() {
        List<User> users = userRepository.findAll();
        return adapter.getResponsesForAllUsers(users);
    }

    @Override
    public Optional<UserResponse> getUser(Long id) {
        Optional<User> oUser = userRepository.findById(id);
        if (oUser.isPresent()) {
            return Optional.of(adapter.convertObject(oUser.get(), UserResponse.class));
        } else {
            return Optional.empty();
        }
    }


    @Override
    public UserResponse saveUser(UserDTO userDTO) {
        User user = adapter.convertObject(userDTO, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User saved = userRepository.save(user);
        return adapter.convertObject(saved, UserResponse.class);
    }

    @Override
    public Boolean deleteUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            userRepository.deleteById(userId);
            return true;
        } else {
            return false;
        }
    }
}
