package com.company.tech.vehicles;

public class Car extends Vehicles{
    private String marka;

    public Car(){

    }

    public Car(String name, String color, double price, String country,
               double weight, String mildet, String marka) {
        super(name, color, price, country, weight, mildet);
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "} " + super.toString();
    }
}
