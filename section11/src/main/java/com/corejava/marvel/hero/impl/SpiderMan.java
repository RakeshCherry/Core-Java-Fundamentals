package com.corejava.marvel.hero.impl;

import com.corejava.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {

    @Override
    public String usePower() {
        return "SpiderMan using is Power";
    }

    @Override
    public String stopVillain(char c) {
        if(c == 'Y'){
            return "SpiderMan killed the Villain";
        }else{
            return "SpiderMan Stopped the Villain";
        }
    }

    @Override
    public String trackLiveLocation(){
        String location = "London";
        System.out.println("I am in " + location);
        return location;
    }
}
