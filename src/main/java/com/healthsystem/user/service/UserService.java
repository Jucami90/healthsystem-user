package com.healthsystem.user.service;

import com.healthsystem.user.dto.UserRequestDTO;
import com.healthsystem.user.dto.UserResponseDTO;
import com.healthsystem.user.entity.User;
import com.healthsystem.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO createUser(UserRequestDTO dto){
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        user = userRepository.save(user);

        UserResponseDTO response = new UserResponseDTO();
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        return response;
    }

    public UserResponseDTO findUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        UserResponseDTO response = new UserResponseDTO();
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        return response;
    }

}
