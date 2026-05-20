package com.easybytes.has_a;

public class Main {

    public static void main() {
        Address personaddress = new Address(1002,"Nexa Col","Udaipur","Raj", "313001");
        Person person = new Person("Ram", personaddress);
        System.out.println(person.getPersonInfo());

    }
}
