package com.company;

public class Hunter extends Fighter {
    private int i = 0;

    public Hunter() {
        this.sethPoints(50);
    }
    public int attack() {
        i++;
        if(i % 2 == 0){
            return 5;
        } else {
            return 8;
        }
    }
    @Override
    public String toString() {
        return "Hp of the hunter is " + gethPoints();
    }

}
