package org.example.Objects.Engine;

public class v6Engine implements EngineBehavior {
    private String name;
    public v6Engine() {
        this.name = "v6Engine";
        System.out.println("Adding  v6Engine");
    }
    @Override
    public String getName() {
        return this.name;
    }
}
