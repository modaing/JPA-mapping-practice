package com.ohgiraffers.hospital;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @EmbeddedId
    private PatientCC patientCCInfo;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "chief_complaint")
    private String chiefComplaint;

    @Column(name = "specialist")
    private String specialist;

    protected Patient() {
    }

    public Patient(PatientCC patientCCInfo, String patientName, String phone, String address, String chiefComplaint, String specialist) {
        this.patientCCInfo = patientCCInfo;
        this.patientName = patientName;
        this.phone = phone;
        this.address = address;
        this.chiefComplaint = chiefComplaint;
        this.specialist = specialist;
    }

    public PatientCC getPatientCCInfo() {
        return patientCCInfo;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public String getSpecialist() {
        return specialist;
    }
}
