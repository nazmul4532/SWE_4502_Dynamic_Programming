package org.example;

public class Glider implements GlideCharacter{
    @Override
    public void glide() {
        System.out.println("I am Gliding");
    }

    @Override
    public void dodge() {
        System.out.println("Dodge dodge dodge");
    }
}
