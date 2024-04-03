package org.example.Objects.Turbochargers;

public class Honeywell implements TurbochargerBehavior {
    private String name;
    public Honeywell() {
        this.name = "Honeywell";
        System.out.println("Adding Honeywell Turbocharger");
    }
    public String getName() {
        return this.name;
    }
}
