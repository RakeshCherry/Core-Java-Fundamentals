package com.corejava.marvel.hero.impl;

import com.corejava.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {

    @Override
    public String usePower() {
        return "CaptainAmerica using is Power";
    }

    @Override
    public String stopVillain(char c) {
        if(c == 'Y'){
            return "CaptainAmerica killed the Villain";
        }else{
            return "CaptainAmerica Stopped the Villain";
        }
    }
}
