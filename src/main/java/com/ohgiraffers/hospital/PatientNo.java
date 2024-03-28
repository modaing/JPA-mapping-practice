package com.ohgiraffers.hospital;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PatientNo {

    @Column(name = "patient_no")
    private int patientNo;

    protected PatientNo() {}

    public PatientNo(int patientNo) {
        this.patientNo = patientNo;
    }

    public int getPatientNo() {
        return patientNo;
    }
}
