package com.mycompany.designpatterns.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.quackBehaviour = new Quack();
        super.flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
    }

}
