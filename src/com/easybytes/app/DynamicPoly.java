package com.easybytes.app;

import com.easybytes.base.Person;
import com.easybytes.child.IronMan;

public class DynamicPoly {
    static void main() {
        Person person = new IronMan(); //Upcasting
        person.walk();
        person.eat("RawIron");
    }
}
