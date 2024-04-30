package com.learnings.design_patterns.abstract_p.shapes_adapter;

public class RoundHole {

    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return getRadius() >= roundPeg.getRadius();
    }
}
