package org.example;

public class SprintTestDrive {
    public static void main(String[] args) {
        SprintCharacter ganyu = new Sprinter();
        SprintCharacter glideAdapter = new GlideAdapter(new Glider());

        System.out.println("Testing Sprint Character");
        run(ganyu);

        System.out.println("Testing Glide Character");
        run(glideAdapter);
    }
    static void run(SprintCharacter character) {
        character.sprint();
        character.dodge();
    }
}
