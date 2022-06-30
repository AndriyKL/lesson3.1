package com.company;

public class Circle implements Objects{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return  Math.PI * (2 * radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
