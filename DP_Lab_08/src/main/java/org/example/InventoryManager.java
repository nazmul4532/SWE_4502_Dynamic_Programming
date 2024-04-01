package org.example;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Item> inventory = new ArrayList<>();

    public void addItem(String name, int quantity) {
        boolean flag = false;
        for(Item item : inventory)
        {
            if(item.getName().equals(name))
            {
                flag = true;
            }
            if(flag == true)
            {
                int newQuantity = quantity + item.getQuantity();
                item.setQuantity(newQuantity);
                System.out.println("Name: "+name+"\nQuantity: " + newQuantity+"\n");
                break;
            }
        }
        if(flag == false){
            Item item = new Item(name, quantity);
            System.out.println("New Item has been created");
            System.out.println("Name: "+name+"\nQuantity: " + quantity+"\n");
            inventory.add(item);
        }
    }

    public void removeItem(String name, int quantity) {
        boolean flag = false;
        for(Item item : inventory) {
            if (item.getName().equals(name)) {
                flag = true;
            }
            if (flag == true) {
                int currQuantity = item.getQuantity();
                if(currQuantity > quantity)
                {
                    int newQuantity = currQuantity-quantity;
                    System.out.println(quantity + " amount of " + name + " has been removed!!");
                    item.setQuantity(newQuantity);
                    System.out.println(newQuantity + " amount of " + name + " is now in inventory.\n");
                }
                else if(currQuantity == quantity)
                {
                    System.out.println(quantity + " amount of " + name + " has been removed!!");
                    inventory.remove(item);
                    System.out.println(name + " has been removed from the inventory\n");
                }
                else if (currQuantity < quantity)
                {
                    System.out.println("The amount of "+ name +" to be consumed exceeds the inventory amount");
                    System.out.println("Cannot update the inventory quantity\n");
                }
                break;
            }
        }
        if(flag == false){
            System.out.println("This Item doesn't exist in the Inventory, please add it first.\n");
        }

    }

    public List<Item> getInventory() {
        return inventory;
    }
}
