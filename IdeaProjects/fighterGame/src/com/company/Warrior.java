package com.company;

public class  Warrior extends Fighter{
    private int i = 0;

    public Warrior() {
        this.sethPoints(100);
    }

    public int attack() {
        i++;

        return i;
        }
    @Override
    public String toString() {
        return "Hp of the warrior is " + gethPoints();
    }
}
