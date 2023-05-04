package com.mycompany.designpatterns.strategy;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am Flying With Wings:::");
    }

}
