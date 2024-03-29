package org.example;

public class VillageComponentBuilder {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape triangle = new Triangle();

    public Shape buildComponentA(){
        VillageComponentA a = new VillageComponentA();
        return a;
    }
    public Shape buildComponentB() {
        VillageComponentB b = new VillageComponentB();
        return b;
    }
}
