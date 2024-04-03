package org.example.Objects.Turbochargers;

public class Cummins implements TurbochargerBehavior{

    private String name;
    public Cummins() {
        this.name = "Cummins";
        System.out.println("Adding Cummins Turbocharger");
    }
    public String getName() {
        return this.name;
    }
}
