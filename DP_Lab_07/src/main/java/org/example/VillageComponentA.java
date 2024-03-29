package org.example;
import java.util.List;
import java.util.ArrayList;

public class VillageComponentA implements Shape{
    public List<Shape> compList = new ArrayList<Shape>();

    public VillageComponentA() {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        List<Shape> houseList = new ArrayList<Shape>();
        houseList.add(triangle);
        houseList.add(rectangle);

        Shape house = new MudHouse(houseList);
        compList.add(house);

        List<Shape> waterSourceList = new ArrayList<Shape>();
        waterSourceList.add(rectangle);
        Shape pond = new Pond(waterSourceList);
        compList.add(pond);

        List<Shape> treeList = new ArrayList<Shape>();
        treeList.add(rectangle);
        Shape bananaTree = new BananaTree(treeList);
        compList.add(bananaTree);
    }

    @Override
    public String getShape() {
        String s = "Village Component A consists of: \n";
        for(Shape shape : compList) {
            s += shape.getShape();
            s += "\n";
        }
        return s;
    }
}
