package org.example.Objects.Car;
import org.example.Objects.Turbochargers.TurbochargerBehavior;
import org.example.Objects.Engine.EngineBehavior;

public abstract class Car {
    protected String name;
    protected EngineBehavior engine;
    protected TurbochargerBehavior turbocharger;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void start() {
        System.out.println("Starting " + name);
    }

    public void stop() {
        System.out.println("Stopping " + name);
    }

    public void accelerate() {
        System.out.println("Accelerating " + name);
    }

    public EngineBehavior getEngine(){
        return this.engine;
    }
    public void setEngine(EngineBehavior engineBehavior) {
        this.engine = engineBehavior;
    }

    public TurbochargerBehavior getTurbocharger(){
        return this.turbocharger;
    }
    public void setTurbocharger(TurbochargerBehavior turbochargerBehavior) {
        this.turbocharger = turbochargerBehavior;
    }

    public void carInfo() {
        System.out.println("Car: " + name);
        System.out.println("Turbocharger: " + turbocharger.getName());
        System.out.println("Engine: " + engine.getName());
    }
}
