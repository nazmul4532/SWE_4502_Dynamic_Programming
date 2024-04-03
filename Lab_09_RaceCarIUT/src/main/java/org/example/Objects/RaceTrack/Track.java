package org.example.Objects.RaceTrack;

public abstract class Track {
    protected String name;
    protected String location;
    protected String type;

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public String getLocation(){
        return this.location;
    }
    public void trackInfo(){
        String info = "The track information: ";
        info +="\nName: "+name+"\ntype: "+type+"\nLocation: "+location;

    }
}
