package com.sfg.clinic.sfgclinic.model;

import javax.persistence.Entity;

@Entity
public class Staff extends Person {

    private String staffType;

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
}
