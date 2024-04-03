package org.example.Objects.Engine;

public class v12Engine implements EngineBehavior {
    private String name;
    public v12Engine() {
        this.name = "v12Engine";
        System.out.println("Adding  v12Engine");
    }
    @Override
    public String getName() {
        return this.name;
    }
}
