package com.corejava.marvel.hero.impl;

import com.corejava.marvel.hero.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String usePower() {
        System.out.println(UNIVERSE_NAME);
        return "IronMan using is Power";
    }

    @Override
    public String stopVillain(char c) {
        if(c == 'Y'){
            return "IronMan killed the Villain";
        }else{
            return "IronMan Stopped the Villain";
        }
    }
}
