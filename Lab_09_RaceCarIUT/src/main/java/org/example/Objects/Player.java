package org.example.Objects;

import org.example.Factories.*;
import org.example.Objects.Car.Car;
import org.example.Objects.Race.Race;
import org.example.Objects.RaceTrack.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    private static Player instance;
    private Car selectedCar;
    private Track selectedTrack;
    private String raceType;

    private String name;

    private static List<String> finishTime= new ArrayList<String>();

    private Player() {
        selectedCar = null;
        selectedTrack = null;
        raceType = "";
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void chooseName() {
        System.out.print("Enter Player Name: ");
        name = scanner.nextLine();
        System.out.println("Current Player: " + getName());
    }

    public Car getCar() {
        return this.selectedCar;
    }
    public  void chooseCar(Car car) {
        this.selectedCar = car;
        System.out.print("Enter Engine type for "+selectedCar.getName()+"(1.v6/2.v8/3.v12):");
        selectedCar.setEngine(CarBehaviorFactory.getEngine(scanner.nextLine()));
        System.out.print("Enter turbocharger type for "+selectedCar.getName()+"(1.Alpine/2.Cummins/3.Honeywell):");
        selectedCar.setTurbocharger(CarBehaviorFactory.getTurbocharger(scanner.nextLine()));
        System.out.println(selectedCar.getName()+" has been created");
    }

    public Track getTrack() {
        return selectedTrack;
    }
    public void chooseTrack(Track track) {
        this.selectedTrack = track;
    }
    public String getRaceType(){
        return raceType;
    }
    public void chooseRaceType() {
        System.out.print("Enter Track Type(1.Circuit/2.Sprint): ");
        String var = scanner.nextLine();
        if(var.equals("1"))
        {
            raceType = "Circuit";
        }
        else if(var.equals("2")){
            raceType = "Sprint";
        }
        else{
            raceType = var;
        }
    }

    public void playerReady(){
        if(selectedCar == null){
            System.out.println("The player not chosen a car yet. Please Select a Car.");
            System.out.print("Enter Car Type(1.Coupe/2.Roadster): ");
            CarFactory carFactory = CarFactoryFetcher.getCarFactory(scanner.nextLine());
            selectedCar = carFactory.createCar(scanner.nextLine());
            System.out.print("Enter Engine type for "+selectedCar.getName()+"(1.v6/2.v8/3.v12):");
            selectedCar.setEngine(CarBehaviorFactory.getEngine(scanner.nextLine()));
            System.out.print("Enter turbocharger type for "+selectedCar.getName()+"(1.Alpine/2.Cummins/3.Honeywell):");
            selectedCar.setTurbocharger(CarBehaviorFactory.getTurbocharger(scanner.nextLine()));
            selectedCar.carInfo();
        }
        else if(raceType == ""){
            System.out.println("The race type has not been selected. Please select a Race Type.");
            chooseRaceType();
        }
        else if( selectedTrack == null) {
            System.out.println("The race track has not been selected. Please select a Race Track.");
            System.out.print("Enter Location(1.USA/2.Japan/3.Germany): ");
            selectedTrack = TrackFactory.createTrack(scanner.nextLine(), getRaceType());
        }
    }

    public void startRace() {
        playerReady();
        boolean flag = true;
        while (flag) {
            selectedCar.carInfo();
            selectedTrack.trackInfo();
            System.out.println("Race Type: " + raceType);
            System.out.println("Starting the race...");
            Race race = RaceFactory.createRace(raceType);
            String time = race.race();
            String info = name + "    " + time;
            finishTime.add(info);
            System.out.print("Do you want to race again?(Y/N): ");
            String ans = scanner.nextLine();
            if(ans.equalsIgnoreCase("N"))
            {
                flag = false;
            } else {
                System.out.println("Current Player: " + getName());
                System.out.println("Want to change player?(Y/N): ");
                ans = scanner.nextLine();
                if(ans.equalsIgnoreCase("Y")){
                    chooseName();
                }
            }
        }
    }
    public void getFinishTime() {
        for (String s : finishTime) {
            System.out.println(s);
        }
    }
}

