package com.company.details;

public class Engine {

    int power;
    String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String toString() {
        return "It's an engine with power" + this.getPower() + " and producer "+ this.getProducer() ;
    }
}
