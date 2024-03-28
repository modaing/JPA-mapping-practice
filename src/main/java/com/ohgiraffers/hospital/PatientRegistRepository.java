package com.ohgiraffers.hospital;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRegistRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Patient patient) {
        manager.persist(patient);
    }
}
