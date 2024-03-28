package com.ohgiraffers.hospital;

public class PatientRegistDTO {

    private int patientNo;              // 환자 번호
    private String patientName;         // 환자 이름
    private String phone;               // 연락처
    private String address;             // 주소
    private String chiefComplaint;      // 주요 호소 증상
    private int chiefComplaintNo;       // 주요 호소 증상 번호
    private String specialist;          // 주치의

    public PatientRegistDTO() {
    }

    public PatientRegistDTO(int patientNo, int chiefComplaintNo) {
        this.patientNo = patientNo;
        this.chiefComplaintNo = chiefComplaintNo;
    }

    public PatientRegistDTO(int patientNo, String patientName, String phone, String address, String chiefComplaint, int chiefComplaintNo, String specialist) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.phone = phone;
        this.address = address;
        this.chiefComplaint = chiefComplaint;
        this.chiefComplaintNo = chiefComplaintNo;
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

    public int getChiefComplaintNo() {
        return chiefComplaintNo;
    }

    public void setChiefComplaintNo(int chiefComplaintNo) {
        this.chiefComplaintNo = chiefComplaintNo;
    }

    @Override
    public String toString() {
        return "PatientRegistDTO{" +
                "patientNo=" + patientNo +
                ", patientName='" + patientName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", chiefComplaintNo=" + chiefComplaintNo +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
