package org.example;

import java.util.List;
import java.util.ArrayList;

public class MudHouse extends House{
    private String type = "Mud House";
    public MudHouse(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The House a "+this.type+" is made of: ";
        s+=super.getShape();
        return s;
    }
}
