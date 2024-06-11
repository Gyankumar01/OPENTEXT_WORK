package com.opentext.MyFirstApplication.model;

public class Employee {
    private int id;
    private String eName;
    private String eAddress;
    private String eOrganisation;
    private String dob;
    private String CollegeName;

    public Employee(int id, String name, String address, String organisation, String dob, String CollegeName) {
        this.id = id;
        this.eName = name;
        this.eAddress = address;
        this.eOrganisation = organisation;
        this.dob = dob;
        this.CollegeName = CollegeName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String geteOrganisation() {
        return eOrganisation;
    }

    public void seteOrganisation(String eOrganisation) {
        this.eOrganisation = eOrganisation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

//Get-Returns the value and Provides read-only access outside the class.
//Set-Updates the value and Allows external code to modify field value.
//Getter and setter methods are fundamental in Java for managing and accessing the properties of a class.