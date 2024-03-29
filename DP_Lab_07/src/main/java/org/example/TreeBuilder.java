package org.example;

import java.util.ArrayList;
import java.util.List;

public class TreeBuilder {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();

    public Shape buildBananaTree(){
        List<Shape> treeList = new ArrayList<Shape>();
        treeList.add(rectangle);
        Shape bananaTree = new BananaTree(treeList);
        return bananaTree;
    }
    public Shape buildMangoTree(){
        List<Shape> treeList = new ArrayList<Shape>();
        treeList.add(rectangle);
        treeList.add(circle);
        Shape mangoTree = new MangoTree(treeList);
        return mangoTree;
    }
    public Shape buildGuavaTree(){
        Shape rectangle = new Rectangle();
        List<Shape> treeList = new ArrayList<Shape>();
        treeList.add(rectangle);
        Shape guavatree = new GuavaTree(treeList);
        return guavatree;
    }
}
