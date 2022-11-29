package com.pragra.Day12;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String designation;
    private String PhoneNo;
    private Address address;

    public Employee(int id, String firstname, String lastname, String designation, String phoneNo, Address address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.designation = designation;
        PhoneNo = phoneNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", designation='" + designation + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                ", address=" + address +
                '}';
    }
}
