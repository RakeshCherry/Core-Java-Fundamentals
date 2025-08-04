package com.corejava.marvel.hero;

public interface SuperHero extends Person{

    String UNIVERSE_NAME = "Marvel";

    String usePower();

    String stopVillain(char c);

    default String trackLiveLocation(){
        String location = "USA";
        System.out.println("I am in " + location);
        return location;
    }
}
