package com.ohgiraffers.hospital;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "patient_no")
    private int patientNo;

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

}
