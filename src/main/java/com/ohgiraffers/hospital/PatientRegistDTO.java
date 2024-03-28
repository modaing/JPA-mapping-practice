package com.ohgiraffers.hospital;

public class PatientRegistDTO {

    private int patientNo;
    private String patientName;
    private String phone;
    private String address;
    private String chiefComplaint;
    private String specialist;

    public PatientRegistDTO() {
    }

    public PatientRegistDTO(int patientNo, String patientName, String phone, String address, String chiefComplaint, String specialist) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.phone = phone;
        this.address = address;
        this.chiefComplaint = chiefComplaint;
        this.specialist = specialist;
    }

    public int getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(int patientNo) {
        this.patientNo = patientNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "PatientRegistDTO{" +
                "patientNo=" + patientNo +
                ", patientName='" + patientName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
