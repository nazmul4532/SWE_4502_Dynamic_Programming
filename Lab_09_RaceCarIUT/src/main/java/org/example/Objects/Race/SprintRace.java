package org.example.Objects.Race;

import org.example.Objects.Car.Car;
import org.example.Objects.RaceTrack.Track;

public class SprintRace extends Race{
    public SprintRace() {
        super();
        this.raceType = "Sprint";
    }
    @Override
    public void raceLogic(){
        int cooldown = 0;
        accelerateCar(car);
        for(int i=0; i<=4;i++) {
            boolean flag = applyNOS();
            if (flag) {
                if(cooldown > 0) {
                    System.out.println("Can't activate NOS. It is under cool down for " + cooldown + " turns.");
                    cooldown--;
                    accelerateCar(car);
                }
                else {
                    car.stop();
                    Car car1 = pitStop(car);
                    startCar(car1);
                    accelerateCar(car1);
                    accelerateCar(car1);
                    accelerateCar(car);
                    cooldown = 1;
                }
            } else{
                if(cooldown>0){
                    cooldown--;
                }
                accelerateCar(car);
                accelerateCar(car);
            }
        }
    }
}
