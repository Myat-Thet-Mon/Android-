package com.example.studentlist_dao;

public class StudentEntity {
    private String name;
    private String dateOfBirth;
    private String address;
    private String phNo;

    public StudentEntity(String name, String dateOfBirth, String address, String phNo) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phNo = phNo;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phNo;
    }
}
