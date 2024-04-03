package org.example.Factories;
import org.example.Objects.Race.CircuitRace;
import org.example.Objects.Race.Race;
import org.example.Objects.Race.SprintRace;

public class RaceFactory {
    public static Race createRace(String raceType){
        if (raceType.equalsIgnoreCase("Sprint")||raceType.equals("1")) {
            return new SprintRace();
        } else if (raceType.equalsIgnoreCase("Circuit")||raceType.equals("2")) {
            return new CircuitRace();
        }
        return null;
    }
}
