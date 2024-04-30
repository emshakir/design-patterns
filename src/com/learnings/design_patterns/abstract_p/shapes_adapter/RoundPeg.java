package com.learnings.design_patterns.abstract_p.shapes_adapter;

public class RoundPeg {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }


    public double getRadius() {
        return radius;
    }
}
