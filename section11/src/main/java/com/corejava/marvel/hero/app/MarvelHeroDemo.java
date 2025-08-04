package com.corejava.marvel.hero.app;

import com.corejava.marvel.hero.SuperHero;
import com.corejava.marvel.hero.impl.CaptainAmerica;
import com.corejava.marvel.hero.impl.IronMan;
import com.corejava.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        System.out.println(SuperHero.UNIVERSE_NAME);

        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        SuperHero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica);
    }

    public static void invokeSuperHero(SuperHero superHero){
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('N'));
    }
}
