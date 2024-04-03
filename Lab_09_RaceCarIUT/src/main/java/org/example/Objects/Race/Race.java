package org.example.Objects.Race;
import org.example.Factories.*;
import org.example.Objects.Car.Car;
import org.example.Objects.NOS.NOS;
import org.example.Objects.Player;
import org.example.Objects.RaceTrack.Track;
import java.util.Random;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public abstract class Race {
    protected Scanner scanner = Player.getInstance().getScanner();
    protected Car car;
    protected Track track;
    protected String raceType;


    public Race() {
        this.car = Player.getInstance().getCar();
        this.track = Player.getInstance().getTrack();

    }
    public final String race(){
        startCar(car);
        startLine(track);
        raceLogic();
        finishLine(track);
        stopCar(car);
        return lapTime();
    }
    public abstract void raceLogic ();
    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        System.out.println("Reached the "+ track.getType()+ " starting line of " + track.getName());
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
    }

    protected NOS pitStop(Car car) {
        System.out.println("Pit stop: Adding NOS to the car");
        System.out.println("What kind of NOS would you like to apply (1.Resonac/2.Sema)");
        String type = scanner.nextLine();
        return NOSFactory.createNOS(type, car);
    }

    protected boolean applyNOS() {
        System.out.println("Want to apply NOS to the car? (Y/N)");
        String flag = scanner.nextLine();
        if(flag.equalsIgnoreCase("Y"))
        {
            return true;
        }
        else{
            return false;
        }
    }
    protected void finishLine(Track track) {
        System.out.println("Crossed the "+track.getType()+" finish line of " + track.getName());
    }

    protected void stopCar(Car car) {
        car.stop();
    }

    protected String lapTime() {
        Random rand = new Random();
        int totalSeconds = rand.nextInt(10 * 60);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        String formattedTime = sdf.format(minutes * 60 * 1000 + seconds * 1000);
        System.out.println("Lap Time: " + formattedTime);
        return formattedTime;
    }

}
