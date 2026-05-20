package com.easybytes.has_a;

public class Address {

    private int flatno;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(int flatno, String street, String city, String state, String zipcode)
    {
        this.flatno = flatno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressInfo(){
        String address = flatno + " " + street + " " + city + " " + state + " " + zipcode;
        return address;
    }




}
