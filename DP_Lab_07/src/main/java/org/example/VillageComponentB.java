package org.example;

import java.util.ArrayList;
import java.util.List;

public class VillageComponentB implements Shape{
    public List<Shape> compList = new ArrayList<Shape>();

    public VillageComponentB() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        List<Shape> houseList = new ArrayList<Shape>();
        houseList.add(triangle);
        houseList.add(circle);

        Shape house = new BrickHouse(houseList);
        compList.add(house);

        List<Shape> waterSourceList = new ArrayList<Shape>();
        waterSourceList.add(circle);
        Shape pool = new Pool(waterSourceList);
        compList.add(pool);

        List<Shape> treeList = new ArrayList<Shape>();
        treeList.add(rectangle);
        treeList.add(circle);
        Shape mangoTree = new MangoTree(treeList);
        compList.add(mangoTree);
    }

    @Override
    public String getShape() {
        String s = "Village Component B consists of: \n";
        for(Shape shape : compList) {
            s += shape.getShape();
            s += "\n";
        }
        return s;
    }
}
