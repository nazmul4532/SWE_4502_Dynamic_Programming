package org.example.Factories;

import java.util.Scanner;

public class CarFactoryFetcher {
    public static CarFactory getCarFactory(String carType){
        if (carType.equalsIgnoreCase("Coupe")||carType.equals("1")) {
            System.out.println("Getting Coupe Car Factory");
            System.out.print("You may choose (1.ToyotaGR86/2.SubaruBRZ): ");
            return new CoupeCarFactory();
        } else if (carType.equalsIgnoreCase("Roadster")||carType.equals("2")) {
            System.out.println("Getting Roadster Car Factory");
            System.out.print("You may choose (1.Ferrari812/2.PorscheBoxer): ");
            return new RoadsterCarFactory();
        } else {
            return null;
        }
    }
}
