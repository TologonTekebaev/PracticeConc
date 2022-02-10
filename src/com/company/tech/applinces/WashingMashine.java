package com.company.tech.applinces;

public class WashingMashine extends Applineces{
    private String speed;
    private double height;

    public WashingMashine(){

    }

    public WashingMashine(String name, String color, double price, String country,
                          double weight, String mildet, String speed, double height) {
        super(name, color, price, country, weight, mildet);
        this.speed = speed;
        this.height = height;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "WashingMashine{" +
                "speed='" + speed + '\'' +
                ", height=" + height +
                "} " + super.toString();
    }
}
