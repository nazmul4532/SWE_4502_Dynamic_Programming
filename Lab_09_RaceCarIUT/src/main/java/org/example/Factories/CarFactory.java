package org.example.Factories;

import org.example.Objects.Car.Car;

public abstract class CarFactory {
    public abstract Car createCar(String carType);
}
