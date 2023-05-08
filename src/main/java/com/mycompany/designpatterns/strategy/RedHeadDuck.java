package com.mycompany.designpatterns.strategy;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Read Head Duck Display :::");
    }

    @Override
    public void fly() {
    }

    @Override
    public void quack() {
    }

}
