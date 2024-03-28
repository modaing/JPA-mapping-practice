package com.ohgiraffers.hospital;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;

@Embeddable
public class PatientCC implements Serializable {

    @Embedded
    private PatientNo patientNo;

    @Embedded
    private ChiefComplaintNo chiefComplaintNo;

    protected PatientCC() {}

    public PatientCC(PatientNo patientNo, ChiefComplaintNo chiefComplaintNo) {
        this.patientNo = patientNo;
        this.chiefComplaintNo = chiefComplaintNo;
    }

    public PatientNo getPatientNo() {
        return patientNo;
    }

    public ChiefComplaintNo getChiefComplaintNo() {
        return chiefComplaintNo;
    }
}
