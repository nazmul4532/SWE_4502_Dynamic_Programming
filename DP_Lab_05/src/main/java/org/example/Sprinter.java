package org.example;

public class Sprinter implements SprintCharacter{
    @Override
    public void sprint() {
        System.out.println("I am Sprinting");
    }

    @Override
    public void dodge() {
        System.out.println("Dodge dodge dodge");
    }
}
