package com.easybytes.child;

import com.easybytes.base.Person;

public class IronMan extends Person {

    public void usePower(){
        System.out.println("IronMan is using his Power");
    }
    @Override
    public void walk(){
        System.out.println("IronMan is walking in his own way");

    }

    @Override
    public void eat(String food) {
        System.out.println("IronMan is eating his own " + food);
    }
}
