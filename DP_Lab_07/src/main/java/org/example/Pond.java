package org.example;

import java.util.List;

public class Pond extends WaterSource {
    private String type ="Pond";
    public Pond(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The Water Source "+ this.type + " is made of: ";
        s += super.getShape();
        return s;
    }
}
