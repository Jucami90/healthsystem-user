package com.healthsystem.user.controller;

import com.healthsystem.user.dto.UserRequestDTO;
import com.healthsystem.user.dto.UserResponseDTO;
import com.healthsystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserResponseDTO createUser(
            @RequestBody UserRequestDTO dto){
        return userService.createUser(dto);
    }

    @GetMapping("/{id}")
    public UserResponseDTO findUser(
            @RequestParam Long id){
        return userService.findUser(id);
    }
}
