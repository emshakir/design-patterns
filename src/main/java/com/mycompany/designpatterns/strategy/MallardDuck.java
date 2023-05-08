package com.mycompany.designpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.quackBehaviour = new Quack();
        super.flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck display Called :::: ");
    }
}
