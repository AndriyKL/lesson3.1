package com.company;

public class Rectangle implements Objects{
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2*(a + b);
    }

    @Override
    public double area() {
        return a*b;
    }
}