package com.mycompany.designpatterns.strategy;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
    }

    @Override
    public void quack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
