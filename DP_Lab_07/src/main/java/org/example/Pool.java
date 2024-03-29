package org.example;

import java.util.List;

public class Pool extends WaterSource {
    private String type ="Swimming Pool";
    public Pool(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The Water Source "+ this.type + " is made of :";
        s += super.getShape();
        return s;
    }
}
