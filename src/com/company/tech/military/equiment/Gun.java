package com.company.tech.military.equiment;

public class Gun extends MilitaryEquiment{
    private double numberGun;
    private String vid;

    public Gun(){

    }

    public Gun(String name, String color, double price, String country, double weight,
               String mildet, double numberGun, String vid) {
        super(name, color, price, country, weight, mildet);
        this.numberGun = numberGun;
        this.vid = vid;
    }

    public double getNumberGun() {
        return numberGun;
    }

    public void setNumberGun(double numberGun) {
        this.numberGun = numberGun;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }
    
    //missed toString()

}
