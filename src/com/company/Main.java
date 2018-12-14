package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Cave Explorer! What is your name?");

    String user = input.nextLine();

    System.out.println("Hello " + user + "!");

    System.out.println("Stupid filler lore");

    Math.random();
    int[][] array = new int[5][5];
    
    for(int i = 0; i<5; i++)
        for(int j = 0; j<5; j++)
            array[i][j] = 0;
    
    for(int i = 0; i<5; i++)
    {
        for(int j = 0; j<5; j++)
        {
            System.out.print(array[i][j]);
        }
        System.out.println();
    }
    //**ALL ROOMS IN THE GAMES**
    //Room UndergroundLake = new Room();
    //Room OldCaveDwelling = new Room();
    //Room DeadEnd = new Room();
    //Room SafeCave = new Room();
    //Room DangerCave = New Room():

     //eventually this will pick difficulty after this setting array size
    //(IMPORTANT CODE I JUST DON'T KNOW WHERE IT GOES)
    // **String Rooms[] = {"UndergroundLake", "OldCaveDwelling", "DeadEnd", "SafeCave"};**
    }
}
