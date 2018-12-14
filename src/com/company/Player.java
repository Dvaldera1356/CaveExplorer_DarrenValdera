package com.company;

public class Player {
    private String name;
    private Item Inventory[];

    public Player(String name){
        this.name = name;
        Inventory = new Item[3];
    }
    public Item[] getInventory(){
        return this.Inventory;
    }
    //has a name (user)
    //Array holds items (holds less items with increasing difficulty)

}
