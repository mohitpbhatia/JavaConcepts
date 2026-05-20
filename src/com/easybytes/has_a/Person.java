package com.easybytes.has_a;

public class Person {
    private String name;
    private Address address;  // Has a relationship with address

    public Person(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }
    public String getPersonInfo(){
        return name + " " + address.getAddressInfo();
    }
}
