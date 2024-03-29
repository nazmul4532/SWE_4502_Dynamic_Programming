package org.example;
import java.util.List;
public abstract class House implements Shape {
    private List<Shape> shapes;

    public House(List<Shape> shapes) {
        this.shapes = shapes;
    }
    @Override
    public String getShape() {
        String s = "";
        for (Shape shape : shapes) {
            s += shape.getShape();
            s += ", ";
        }
        s +="\b\b.";
        return s;
    }
}
