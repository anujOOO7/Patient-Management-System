package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
//        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
//        patientResponseDTO.setId(patient.getId().toString());
//        patientResponseDTO.setName(patient.getName());
//        patientResponseDTO.setEmail(patient.getEmail());
//        patientResponseDTO.setAddress(patient.getAddress());
//        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
//        return patientResponseDTO;
        return new PatientResponseDTO(
                patient.getId().toString(),
                patient.getName(),
                patient.getEmail(),
                patient.getAddress(),
                patient.getDateOfBirth().toString()
        );
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
//        Patient patient = new Patient();
//        patient.setName(patientRequestDTO.getName());
//        patient.setEmail(patientRequestDTO.getEmail());
//        patient.setAddress(patientRequestDTO.getAddress());
//        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
//        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
//        return patient;
        return Patient.builder()
                .name(patientRequestDTO.getName())
                .email(patientRequestDTO.getEmail())
                .address(patientRequestDTO.getAddress())
                .dateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()))
                .registeredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()))
                .build();
    }
}
