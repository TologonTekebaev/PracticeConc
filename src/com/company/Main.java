package com.company;

import com.company.tech.Tech;
import com.company.tech.applinces.Applineces;
import com.company.tech.applinces.FridgeExtends;
import com.company.tech.applinces.WashingMashine;
import com.company.tech.military.equiment.Gun;
import com.company.tech.military.equiment.MilitaryEquiment;
import com.company.tech.military.equiment.Tank;
import com.company.tech.vehicles.Car;
import com.company.tech.vehicles.Truck;
import com.company.tech.vehicles.Vehicles;

public class Main {

    public static void main(String[] args) {

       // Tech tech = new Tech("Tehnica", " black", 20000, " Germany");
        Applineces applineces = new Applineces("Mikrovalnovka", "white", 13000, " USA", 5.0, " tamak jylytuu");
        MilitaryEquiment militaryEquiment = new MilitaryEquiment("BTR", " green", 200000, " China", 3000," korgonuu");
        Vehicles vehicles = new Vehicles("Bus", " pink", 20000, " Kyrgyzstan", 5000, " adam tashuu" );

      //  System.out.println(tech);
        System.out.println(applineces);
        System.out.println(militaryEquiment);
        System.out.println(vehicles);

        FridgeExtends fridgeExtends = new FridgeExtends("LG", " gold", 18000, " Germany", 34.5, " tamak saktoo", 8, 20);
        WashingMashine washingMashine = new WashingMashine("Beko", " white", 2200, " Japan", 34, " kir juu", " munotuno 800 jolu ailanat", 90 );

        System.out.println(fridgeExtends);
        System.out.println(washingMashine);

        Gun gun = new Gun("Ak47", " brown", 25.500, " Russia", 1, " sogushuu", 7, " vystrel");
        Tank tank = new Tank("K56", " brown", 1000000, " USA", 4000, " sogushuu", 20 );

        System.out.println(gun);
        System.out.println(tank);

        Truck truck = new Truck("DAF", " white", 60.000, " USA", 20.000, " juk tashuu", 12.000 );
        Car car = new Car("Eshka", " black", 40.000, " Germany", 5.000, " kishi tashuu", " Mersedes" );

        System.out.println(truck);
        System.out.println(car);
    }
}
