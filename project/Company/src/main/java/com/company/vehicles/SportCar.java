package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    int upperSpeed;
    public SportCar(String mark, String classAuto, int weight, Driver driver, Engine engine, int upperSpeed) {
        super(mark, classAuto, weight, driver, engine);
        this.upperSpeed = upperSpeed;
    }

    public void setUpperSpeed(int upperSpeed) {
        this.upperSpeed = upperSpeed;
    }

    public int getUpperSpeed() {
        return upperSpeed;
    }

    @Override
    public void start() {
        System.out.println("Let's have a quick start!");
    }

    @Override
    public String toString() {
        return "This sport car" + this.mark + " of class " + this.classAuto + " is " + this.weight + "kg. It also has engine" + this.engine + " and a personal driver called " + this.driver + ". It's maximum speed is " + this.upperSpeed + "km/h.";
    }
}
