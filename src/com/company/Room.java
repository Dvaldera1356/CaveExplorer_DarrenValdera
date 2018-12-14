package com.company;

public class Room implements RoomInterface {
    //Things that go in rooms
    private Item roomItem;
    private NPC roomNPC;

    //how room code should look
    public Room(Item roomItem, NPC roomNPC) {

        this.roomItem = roomItem;
        this.roomNPC = roomNPC;

    }
    public Item getroomItem(){
        return this.roomItem;
    }

    public NPC getroomNPC(){
        return this.roomNPC;
    }
}


    //UndergroundLake
        //item
            //water

    //OldCaveDwelling
        //item
            //artifact
    //DeadEnd
        //NPC
            //Enemy

    //SafeCave
        //Villager


