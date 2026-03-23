package com.healthsystem.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorRequestDTO {
    public String name;
    public String specialization;
    public String email;
    public String password;
}
