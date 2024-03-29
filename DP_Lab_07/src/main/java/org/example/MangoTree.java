package org.example;

import java.util.List;

public class MangoTree extends Tree{
    private String type = "Mango Tree";
    public MangoTree(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The " + this.type + " is made of: ";
        s+= super.getShape();
        return s;
    }
}
