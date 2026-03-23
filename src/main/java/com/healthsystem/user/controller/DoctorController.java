package com.healthsystem.user.controller;

import com.healthsystem.user.dto.DoctorRequestDTO;
import com.healthsystem.user.entity.User;
import com.healthsystem.user.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/create")
    public User createDoctor(@RequestBody DoctorRequestDTO dto){
        return doctorService.createDoctor(dto);
    }

}
