package org.example.Objects.Engine;

public class v8Engine implements EngineBehavior {
    private String name;
    public v8Engine() {
        this.name = "v8Engine";
        System.out.println("Adding  v8Engine");
    }
    @Override
    public String getName() {
        return this.name;
    }
}
