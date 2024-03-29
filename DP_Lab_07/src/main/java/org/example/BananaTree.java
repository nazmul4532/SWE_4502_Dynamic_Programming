package org.example;

import java.util.List;

public class BananaTree extends Tree{
    private String type = " Banana Tree";
    public BananaTree(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The Tree " + this.type + " is made of: ";
        s+= super.getShape();
        return s;
    }
}
