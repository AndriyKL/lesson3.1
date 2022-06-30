package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    String mark;
    String classAuto;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String mark, String classAuto, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("STOP!");
    }

    public void turnRight() {
        System.out.println("We're turning right!");
    }

    public void turnLeft() {
        System.out.println("We're turning left!");
    }

    public String toString() {

        return "This car" + this.mark + " of class " + this.classAuto + " is " + this.weight + "kg. It also has engine" + this.engine + " and a personal driver called " + this.driver;
    }
}
