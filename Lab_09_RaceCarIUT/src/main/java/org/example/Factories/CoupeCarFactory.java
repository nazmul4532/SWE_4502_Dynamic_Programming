package org.example.Factories;

import org.example.Objects.Car.CoupeCar;
import org.example.Objects.Car.SubaruBRZ;
import org.example.Objects.Car.ToyotaGR86;

import java.util.Scanner;


public class CoupeCarFactory extends CarFactory{
    @Override
    public CoupeCar createCar(String carType) {
        if (carType.equals("ToyotaGR86")||carType.equals("1")) {
            return new ToyotaGR86();
        } else if (carType.equals("SubaruBRZ")||carType.equals("2")) {
            return new SubaruBRZ();
        } else {
            return null;
        }
    }
}
