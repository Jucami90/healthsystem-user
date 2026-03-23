package com.healthsystem.user.controller;

import com.healthsystem.user.dto.UserRequestDTO;
import com.healthsystem.user.dto.UserResponseDTO;
import com.healthsystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO dto){
        var user = userService.createUser(dto);

        UserResponseDTO response = new UserResponseDTO();
        response.setName(user.getName());
        response.setEmail(user.getEmail());

        return response;
    }
}
