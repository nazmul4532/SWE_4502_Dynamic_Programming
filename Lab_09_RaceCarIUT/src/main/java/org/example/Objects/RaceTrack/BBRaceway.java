package org.example.Objects.RaceTrack;

public class BBRaceway extends Track{
    public BBRaceway(String type){
        this.name = "BB Raceway";
        this.location = "USA";
        this.type = type;
        System.out.println("Adding BB Raceway " + type + " Race Track");
    }
}
