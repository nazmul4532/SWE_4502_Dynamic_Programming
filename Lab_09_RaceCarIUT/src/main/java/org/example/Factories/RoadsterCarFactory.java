package org.example.Factories;

import org.example.Objects.Car.RoadsterCar;
import org.example.Objects.Car.Ferrari812;
import org.example.Objects.Car.PorscheBoxer;

import java.util.Scanner;

public class RoadsterCarFactory extends CarFactory {
    @Override
    public RoadsterCar createCar(String carName) {
        if ("Ferrari812".equals(carName)||carName.equals("1")) {
            return new Ferrari812();
        } else if ("PorscheBoxer".equals(carName)||carName.equals("2")) {
            return new PorscheBoxer();
        } else {
            return null;
        }
    }
}
