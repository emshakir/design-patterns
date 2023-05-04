package com.mycompany.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        duck.performQuack();
        duck.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehaviour(new FlyRocketPowered());
        
        model.performFly();

    }
}
