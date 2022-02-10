package com.company.tech.vehicles;

public class Truck extends Vehicles{
    private double сargoWeight;

    public Truck(){

    }

    public Truck(String name, String color, double price, String country,
                 double weight, String mildet, double сargoWeight) {
        super(name, color, price, country, weight, mildet);
        this.сargoWeight = сargoWeight;
    }

    public double getСargoWeight() {
        return сargoWeight;
    }

    public void setСargoWeight(double сargoWeight) {
        this.сargoWeight = сargoWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "сargoWeight=" + сargoWeight +
                "} " + super.toString();
    }
}
