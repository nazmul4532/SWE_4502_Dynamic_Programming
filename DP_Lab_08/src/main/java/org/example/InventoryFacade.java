package org.example;

import java.util.List;

public class InventoryFacade {
    private InventoryManager inventoryManager = new InventoryManager();

    public void addItem(String name, int quantity) {
        inventoryManager.addItem(name, quantity);
    }

    public void removeItem(String name, int quantity) {
       inventoryManager.removeItem(name, quantity);
    }

    public List<Item> getInventory() {
        return inventoryManager.getInventory();
    }
}
