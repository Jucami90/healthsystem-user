package com.healthsystem.user.service;

import com.healthsystem.user.dto.DoctorRequestDTO;
import com.healthsystem.user.dto.UserRequestDTO;
import com.healthsystem.user.entity.Doctor;
import com.healthsystem.user.entity.User;
import com.healthsystem.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private UserRepository userRepository;

    public User createDoctor(DoctorRequestDTO dto){
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        Doctor doctor = new Doctor();
        doctor.setUser(user);
        doctor.setSpecialization(dto.getSpecialization());

        user.setDoctor(doctor);

        return userRepository.save(user);
    }

}
