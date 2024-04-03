package org.example.Objects.Race;

import org.example.Objects.Car.Car;
import org.example.Objects.RaceTrack.Track;

public class CircuitRace extends Race{
    public CircuitRace() {
        super();
        this.raceType = "Circuit";
    }
    @Override
    public void raceLogic(){
        int cooldown = 0;
        for(int i = 1; i<=3;i++){
            accelerateCar(car);
            for(int j=0; j<=3;j++) {
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
                        cooldown = 2;
                    }
                } else{
                    if(cooldown>0){
                        cooldown--;
                    }
                    accelerateCar(car);
                    accelerateCar(car);
                }
            }
            if(i!=3) {
                startLine(track);
            }
            System.out.println("Completed "+ i + " Lap(s)");
        }
    }
}
