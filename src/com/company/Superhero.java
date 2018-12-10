package com.company;

public class Superhero {

    private String name;
    private String power;
    private int age;

    public Superhero(String name, String power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getPower(){
        return this.power;
    }
    public int getAge(){
        return this.age;
    }
    Superhero Spiderman = ("Peter Parker", "Webs", 16);
}

