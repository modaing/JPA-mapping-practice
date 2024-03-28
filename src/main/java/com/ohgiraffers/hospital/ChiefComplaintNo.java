package com.ohgiraffers.hospital;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ChiefComplaintNo {

    @Column(name = "chief_complaint_no")
    private int chiefComplaintNo;

    protected ChiefComplaintNo() {}

    public ChiefComplaintNo(int chiefComplaintNo) {
        this.chiefComplaintNo = chiefComplaintNo;
    }

    public int getChiefComplaintNo() {
        return chiefComplaintNo;
    }
}
