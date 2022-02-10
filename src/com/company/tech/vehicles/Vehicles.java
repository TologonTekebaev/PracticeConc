package com.company.tech.vehicles;

import com.company.tech.Tech;

public class Vehicles extends Tech {
    private double weight;
    private String mildet;

    public Vehicles(){

    }

    public Vehicles(String name, String color, double price, String country,
                    double weight, String mildet) {
        super(name, color, price, country);
        this.weight = weight;
        this.mildet = mildet;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMildet() {
        return mildet;
    }

    public void setMildet(String mildet) {
        this.mildet = mildet;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "weight=" + weight +
                ", mildet='" + mildet + '\'' +
                "} " + super.toString();
    }
}
