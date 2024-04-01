package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        InventoryFacade inventoryFacade = new InventoryFacade();

        inventoryFacade.addItem("staffOfHoma", 2);
        inventoryFacade.addItem("sweetMadame", 2000);

        inventoryFacade.removeItem("sweetMadame", 500);
        inventoryFacade.removeItem("sweetMadame",2000);
        inventoryFacade.removeItem("sweetMadame",1500);


        List<Item> playerInventory = inventoryFacade.getInventory();


        for (Item item : playerInventory) {
            System.out.println(item);
        }
    }
}