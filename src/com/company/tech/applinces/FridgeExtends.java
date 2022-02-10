package com.company.tech.applinces;

public class FridgeExtends extends Applineces {
    private int boxQuantity;
    private double degree;

    public FridgeExtends(){

    }

    public FridgeExtends(String name, String color, double price, String country,
                         double weight, String mildet, int boxQuantity, double degree) {
        super(name, color, price, country, weight, mildet);
        this.boxQuantity = boxQuantity;
        this.degree = degree;
    }

    public int getBoxQuantity() {
        return boxQuantity;
    }

    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "FridgeExtends{" +
                "boxQuantity=" + boxQuantity +
                ", degree=" + degree +
                "} " + super.toString();
    }
}
