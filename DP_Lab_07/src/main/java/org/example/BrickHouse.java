package org.example;

import java.util.List;

public class BrickHouse extends House {
    private String type = "Brick House";
    public BrickHouse(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The House a "+ this.type +" is made of: ";
        s+=super.getShape();
        return s;
    }
}
