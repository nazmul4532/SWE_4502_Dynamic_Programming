package org.example;

public class Main {
    public static void main(String[] args) {
        VillageComponentBuilder componentBuilder = new VillageComponentBuilder();
        HouseBuilder houseBuilder = new HouseBuilder();
        WaterSourceBuilder waterSourceBuilder = new WaterSourceBuilder();
        TreeBuilder treeBuilder = new TreeBuilder();

        Village munshiganj = new Village();

        Shape compA = componentBuilder.buildComponentA();
        Shape brickHouse = houseBuilder.buildBrickHouse();
        Shape pool = waterSourceBuilder.buildPool();
        Shape guavaTree = treeBuilder.buildGuavaTree();

        munshiganj.addComponents(compA);
        munshiganj.addComponents(brickHouse);
        munshiganj.addComponents(pool);
        munshiganj.addComponents(guavaTree);

        System.out.println("----------------------------------------");
        System.out.println("Village");
        System.out.println(munshiganj.showComponents());
        System.out.println("----------------------------------------");
        System.out.println("Component A");
        System.out.println(compA.getShape());
        System.out.println("----------------------------------------");
        System.out.println("Brick House");
        System.out.println(brickHouse.getShape());
        System.out.println("----------------------------------------");
        System.out.println("Pool");
        System.out.println(pool.getShape());
        System.out.println("----------------------------------------");
        System.out.println("Guava Tree");
        System.out.println(guavaTree.getShape());

    }
}