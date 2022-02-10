package com.company.tech.military.equiment;

import java.lang.ref.PhantomReference;

public class Tank extends MilitaryEquiment {
    private double gunlength;


    public Tank() {

    }

    public Tank(String name, String color, double price, String country, double weight,
                String mildet, double gunlength) {
        super(name, color, price, country, weight, mildet);
        this.gunlength = gunlength;
    }

    public double getGunlength() {
        return gunlength;
    }

    public void setGunlength(double gunlength) {
        this.gunlength = gunlength;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "gunlength=" + gunlength +
                "} " + super.toString();
    }
}
