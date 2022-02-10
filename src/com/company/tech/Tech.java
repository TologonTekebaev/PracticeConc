package com.company.tech;

public class Tech {
    private String name;
    private String color;
    private double price;
    private String country;

    public Tech(){

    }

    public Tech(String name, String color, double price, String country) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }
}