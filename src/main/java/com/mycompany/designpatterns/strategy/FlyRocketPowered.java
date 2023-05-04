package com.mycompany.designpatterns.strategy;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am Flying in Rocket ::: ");
    }

}
