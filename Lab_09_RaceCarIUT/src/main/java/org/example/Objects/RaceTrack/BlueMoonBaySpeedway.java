package org.example.Objects.RaceTrack;

public class BlueMoonBaySpeedway extends Track{
    public BlueMoonBaySpeedway(String type){
        this.name = "Blue Moon Bay Speedway";
        this.location = "Japan";
        this.type = type;
        System.out.println("Adding Blue Moon Bay Speedway " + type+ " Race Track");
    }
}
