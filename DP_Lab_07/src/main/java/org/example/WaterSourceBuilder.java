package org.example;

import java.util.ArrayList;
import java.util.List;

public class WaterSourceBuilder {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();

    public Shape buildPond(){
        List<Shape> waterSourceList = new ArrayList<Shape>();
        waterSourceList.add(rectangle);
        Shape pond = new Pond(waterSourceList);
        return pond;
    }
    public Shape buildPool(){
        List<Shape> waterSourceList = new ArrayList<Shape>();
        waterSourceList.add(circle);
        Shape pool = new Pool(waterSourceList);
        return pool;
    }
}
