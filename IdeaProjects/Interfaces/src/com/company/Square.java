package com.company;

public class Square implements Objects{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
