package com.pm.patientservice.impl.service;

import com.pm.patientservice.api.dto.PatientRequestDTO;
import com.pm.patientservice.api.dto.PatientResponseDTO;
import com.pm.patientservice.api.exceptions.EmailAlreadyExistsException;
import com.pm.patientservice.api.exceptions.PatientNotFoundException;
import com.pm.patientservice.api.service.PatientService;
import com.pm.patientservice.impl.mapper.PatientMapper;
import com.pm.patientservice.impl.model.Patient;
import com.pm.patientservice.impl.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientResponseDTO> getAllPatient() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDTO).toList();
    }

    @Override
    public PatientResponseDTO getPatientById(UUID id) {
        Patient patient = patientRepository.findById(id).orElseThrow(
                () -> new PatientNotFoundException(String.format("Patient not found with id: %s", id)));
        return PatientMapper.toDTO(patient);
    }

    @Override
    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        if (patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException(String.format(
                    "Patient with email %s already exists.",
                    patientRequestDTO.getEmail()
            ));
        }
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(newPatient);
    }

    @Override
    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO) {
        Patient patient = patientRepository.findById(id).
                orElseThrow(() -> new PatientNotFoundException(String.format("Patient not found with id: %s", id)));

        if (patientRepository.existsByEmailAndIdNot(patientRequestDTO.getEmail(), patient.getId())) {
            throw new EmailAlreadyExistsException(String.format(
                    "Patient with email %s already exists.",
                    patientRequestDTO.getEmail()
            ));
        }

        patient.setName(patientRequestDTO.getName());
        patient.setAge(patientRequestDTO.getAge());
        patient.setGender(patientRequestDTO.getGender());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));

        Patient updatedPatient = patientRepository.save(patient);
        return PatientMapper.toDTO(updatedPatient);
    }

    @Override
    public void deletePatient(UUID id) {
        patientRepository.findById(id).orElseThrow(() -> new PatientNotFoundException("Patient not found with id: " + id));
        patientRepository.deleteById(id);
    }
}
