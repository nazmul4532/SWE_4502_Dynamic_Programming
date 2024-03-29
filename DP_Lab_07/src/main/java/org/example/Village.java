package org.example;
import java.util.List;
import java.util.ArrayList;

public class Village {
    private List<Shape> shapes = new ArrayList<Shape>();
    public void addComponents (Shape shape) {
        shapes.add(shape);
    }
    public String showComponents (){
        String s ="The Village consists of : ";
        s+="\n";
        for(Shape shape : shapes){
            s+= shape.getShape();
            s+="\n";
        }
        return s;
    }
}
