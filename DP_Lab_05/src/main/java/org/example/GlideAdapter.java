package org.example;

public class GlideAdapter implements SprintCharacter {
    GlideCharacter glider;
    public GlideAdapter (GlideCharacter glider) {
        this.glider = glider;
    }

    public void sprint() {
        glider.glide();
    }

    public void dodge() {
        glider.dodge();
    }
}
