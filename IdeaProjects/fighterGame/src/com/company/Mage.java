package com.company;

public class Mage extends Fighter {

    public Mage() {
        this.sethPoints(30);
    }

    public int attack() {
        int min = 2;
        int max = 20;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    @Override
    public String toString() {
        return "Hp of the mage is " + gethPoints();
    }

}
