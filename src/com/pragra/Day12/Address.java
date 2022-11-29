package com.pragra.Day12;

public class Address {

   private String address1;
    private String address2;
    private String postalcode;

    public Address(String address1, String address2, String postalcode) {
        this.address1 = address1;
        this.address2 = address2;
        this.postalcode = postalcode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", postalcode='" + postalcode + '\'' +
                '}';
    }
}
