package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Cave Explorer! What is your name?");

    String user = input.nextLine();

    System.out.println("Hello " + user + "!");

    System.out.println("Stupid filler lore");
    //eventually this will pick difficulty after this setting array size

    }
}
