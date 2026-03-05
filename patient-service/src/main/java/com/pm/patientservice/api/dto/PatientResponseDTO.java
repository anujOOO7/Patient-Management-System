package com.pm.patientservice.api.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientResponseDTO {
    private String id;
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private String address;
    private String dateOfBirth;
}
