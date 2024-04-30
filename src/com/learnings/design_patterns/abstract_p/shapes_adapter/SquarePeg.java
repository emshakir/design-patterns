package com.learnings.design_patterns.abstract_p.shapes_adapter;

public class SquarePeg {

    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(width, 2);
    }
}
