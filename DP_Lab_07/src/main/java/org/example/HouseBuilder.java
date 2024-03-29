package org.example;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();
    public Shape buildMudHouse(){
        List<Shape> houseList = new ArrayList<Shape>();
        houseList.add(triangle);
        houseList.add(rectangle);

        Shape mudhouse = new MudHouse(houseList);
        return mudhouse;
    }
    public Shape buildBrickHouse(){
        List<Shape> houseList = new ArrayList<Shape>();
        houseList.add(triangle);
        houseList.add(rectangle);

        Shape brickhouse = new BrickHouse(houseList);
        return brickhouse;
    }
}
