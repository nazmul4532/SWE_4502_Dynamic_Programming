package org.example.Factories;
import org.example.Objects.RaceTrack.BBRaceway;
import org.example.Objects.RaceTrack.BlueMoonBaySpeedway;
import org.example.Objects.RaceTrack.CircuitdeSpaFrancorchamps;
import org.example.Objects.RaceTrack.Track;

public class TrackFactory {
    public static Track createTrack (String location, String type){
        if(location.equalsIgnoreCase("USA")||location.equalsIgnoreCase("1"))
        {
            return new BBRaceway(type);
        }
        else if(location.equalsIgnoreCase("Japan")||location.equalsIgnoreCase("2")){
            return new BlueMoonBaySpeedway(type);
        }
        else if(location.equalsIgnoreCase("Germany")||location.equalsIgnoreCase("3")){
            return new CircuitdeSpaFrancorchamps(type);
        }
        else{
            return null;
        }
    }
}
