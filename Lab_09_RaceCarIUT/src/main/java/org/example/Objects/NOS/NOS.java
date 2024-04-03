package org.example.Objects.NOS;

import org.example.Objects.Car.Car;

public abstract class NOS extends Car {
    public Car car;
    String nos;
    public NOS(Car car) {
        super(car.getName());
        this.car = car;
    }

    @Override
    public void start() {
        System.out.print("Using "+ this.nos+" for ");
        car.start();
    }

    @Override
    public void stop() {
        System.out.print("Using "+ this.nos+" for ");
        car.stop();
    }

    @Override
    public void accelerate() {
        System.out.print("Using "+ this.nos+" for ");
        car.accelerate();
    }
}
