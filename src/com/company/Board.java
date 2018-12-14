package com.company;

public class Board {
    //Board is a 2D Array of Rooms
    private Room board[][];

    public Board(int enemies) {
        int rowIndex, colIndex;

        String Stuff[] = {"Food", "Tools", "Artifacts"};
        int Picker;

        for (int i = 0; i < enemies; i++) {
            rowIndex = (int) (Math.random() * 5); // [0, 5)
            colIndex = (int) (Math.random() * 5);
            Picker = (int) (Math.random() * 3);
            board[rowIndex][colIndex] = new Room(new Item(Stuff[Picker]), new NPC("Enemy"));
        }

        rowIndex = (int) (Math.random() * 5); // [0, 5)
        colIndex = (int) (Math.random() * 5);

        board[rowIndex][colIndex] = new Room(new Item("Nothing"), new NPC("Player"));

        rowIndex = (int) (Math.random() * 5); // [0, 5)
        colIndex = (int) (Math.random() * 5);

        board[rowIndex][colIndex] = new Room(new Item("Something"), new NPC("Villager"));
    }
}
