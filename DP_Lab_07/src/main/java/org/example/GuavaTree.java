package org.example;

import java.util.List;

public class GuavaTree extends Tree{
    private String type = "Guava Tree";
    public GuavaTree(List<Shape> shapes) {
        super(shapes);
    }
    @Override
    public String getShape(){
        String s = "The " + this.type + " is made of: ";
        s+= super.getShape();
        return s;
    }
}
