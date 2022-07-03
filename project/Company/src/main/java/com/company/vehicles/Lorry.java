package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int loadCapacity;

    public Lorry(String mark, String classAuto, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(mark, classAuto, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Let's carry this luggage to the destination!");
    }

    @Override
    public String toString() {
        return "This lorry" + this.mark + " of class " + this.classAuto + " is " + this.weight + "kg. It also has engine" + this.engine + " and a personal driver called " + this.driver + ". It's load capacity is " + this.loadCapacity + " kg.";
    }
}
