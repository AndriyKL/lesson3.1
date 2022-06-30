package com.company;

public abstract class Fighter {
    private int hPoints;

    public int gethPoints() {
        return hPoints;
    }

    public void sethPoints(int hPoints) {
        this.hPoints = hPoints;
    }


    public abstract int attack();
}
