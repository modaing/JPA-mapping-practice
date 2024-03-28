package com.ohgiraffers.hospital;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientRegistService {

    private PatientRegistRepository patientRegistRepository;

    public PatientRegistService(PatientRegistRepository patientRegistRepository) {
        this.patientRegistRepository = patientRegistRepository;
    }

    @Transactional
    public void patientRegistCC(PatientRegistDTO patientRegistDTO) {
        Patient patient = new Patient(
                new PatientCC(
                        new PatientNo(patientRegistDTO.getPatientNo()),
                        new ChiefComplaintNo(patientRegistDTO.getChiefComplaintNo())
                ),
                patientRegistDTO.getPatientName(),
                patientRegistDTO.getPhone(),
                patientRegistDTO.getAddress(),
                patientRegistDTO.getChiefComplaint(),
                patientRegistDTO.getSpecialist()
        );

        patientRegistRepository.save(patient);
    }
}
