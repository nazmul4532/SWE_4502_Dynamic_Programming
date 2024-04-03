package org.example;
import org.example.Factories.*;
import org.example.Objects.Car.Car;
import org.example.Objects.Player;
import org.example.Objects.RaceTrack.Track;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = Player.getInstance();
        Scanner scanner = player.getScanner();

        player.chooseName();
        player.chooseRaceType();

        System.out.print("Enter Location(1.USA/2.Japan/3.Germany): ");
        Track track = TrackFactory.createTrack(scanner.nextLine(),  player.getRaceType());
        player.chooseTrack(track);


        System.out.print("Enter Car Type(1.Coupe/2.Roadster): ");
        CarFactory carFactory = CarFactoryFetcher.getCarFactory(scanner.nextLine());
        Car car = carFactory.createCar(scanner.nextLine());
        player.chooseCar(car);

        System.out.println("-----------------------Previously Applied Engine and Turbocharger--------------------------------");
        player.getCar().carInfo();

        System.out.println("-------------------Changing the Engine and TurboCharger in Runtime----------------------------");
        System.out.print("Which engine to change for the "+player.getCar().getName()+"? (1.v6/2.v8/3.v12):");
        player.getCar().setEngine(CarBehaviorFactory.getEngine(scanner.nextLine()));

        System.out.print("Which turbocharger to change for the "+player.getCar().getName()+"? (1.Alpine/2.Cummins/3.Honeywell):");
        player.getCar().setTurbocharger(CarBehaviorFactory.getTurbocharger(scanner.nextLine()));

        player.getCar().carInfo();

        System.out.println("-----------------------------------Calling the Race-------------------------------------------");
        player.startRace();
        player.getFinishTime();



    }
}