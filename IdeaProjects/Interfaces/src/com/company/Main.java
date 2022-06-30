package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Objects> objectsList = new ArrayList();

        Objects circle = new Circle(5);
        Objects square = new Square(3);
        Objects rectangle = new Rectangle(2,4);

        objectsList.add(circle);
        objectsList.add(square);
        objectsList.add(rectangle);


        double sumA = 0;
        int i;
        int instanceCount = 0;
        for(i = 0; i < objectsList.size(); i++) {
            System.out.println("Perimeter of obj"+ i + " is " + objectsList.get(i).perimeter());
            System.out.println("Area of obj"+ i + " is " + objectsList.get(i).area());
            sumA = sumA + objectsList.get(i).area();

            if(objectsList.get(i) instanceof  Circle) {
                instanceCount++;
            }
        }

        System.out.println("The average area is " + sumA/i);
        System.out.println("There is/are " + instanceCount + " object(s) of class 'Circle'");

    }
}