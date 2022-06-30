package ua.pp.voronin.serhii.tommy.oop.polymorphism;

import ua.pp.voronin.serhii.tommy.oop.shapes.Circle;
import ua.pp.voronin.serhii.tommy.oop.shapes.Rectangle;
import ua.pp.voronin.serhii.tommy.oop.shapes.Shape;
import ua.pp.voronin.serhii.tommy.oop.shapes.Square;

public class Calculator {

    public static void main(String[] args) {
        calculateArea(new Square(15));
        calculateArea(new Rectangle(10, 5));
        calculateArea(new Circle(5));
        calculateArea(new Square(3));
        calculateArea(new Rectangle(2, 7));
        calculateArea(new Circle(2));
    }

    public static void calculateArea(Shape shape) {
        double area = shape.getArea();
        System.out.println("Площа об'єкту " + shape + " складає " + area);
    }
}
