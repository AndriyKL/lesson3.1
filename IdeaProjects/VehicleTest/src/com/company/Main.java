package com.company;

public class Main {

    public static void main(String[] args) {
        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        Car car = new Car();

        car.go();

        Bike bike = new Bike();

        car.go();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.pedals);
    }
}
