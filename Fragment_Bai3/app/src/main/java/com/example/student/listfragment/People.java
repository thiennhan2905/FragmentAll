package com.example.student.listfragment;

import java.io.Serializable;

public class People implements Serializable {
    String fullName, birhDay, Address, email;

    public People() {
    }

    public People(String fullName, String birhDay, String address, String email) {
        this.fullName = fullName;
        this.birhDay = birhDay;
        Address = address;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirhDay() {
        return birhDay;
    }

    public void setBirhDay(String birhDay) {
        this.birhDay = birhDay;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
