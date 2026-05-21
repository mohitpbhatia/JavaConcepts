package com.easybytes.base;

import java.sql.SQLOutput;

public class Person {
    protected String name;
    protected int age;

    public void walk()
    {
        System.out.println("Person is walking");

    }
    public void eat(String food)
    {
        System.out.println("Person is eating " + food);
    }

}
