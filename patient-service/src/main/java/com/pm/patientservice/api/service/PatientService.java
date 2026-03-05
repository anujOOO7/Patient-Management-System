package com.pm.patientservice.api.service;

import com.pm.patientservice.api.dto.PatientRequestDTO;
import com.pm.patientservice.api.dto.PatientResponseDTO;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    public List<PatientResponseDTO> getAllPatient();

    public PatientResponseDTO getPatientById(UUID id);

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);

    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);

    public void deletePatient(UUID id);
}
