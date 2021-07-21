package heros;

import models.Hero;

public class Paladin extends Hero {

    int dex;


    public Paladin(String name, int hp, int mp, int pwr) {
        super(name, hp, mp, pwr);
        this.dex = 30;
    }

    public Paladin(String name, int hp, int mp, int pwr, int dex) {
        super(name, hp, mp, pwr);
        this.dex = dex;
    }

    @Override
    public void heal(int hp) {
        System.out.println(name + " heal up to " + (hp + 10));
    }

    public void attack() {
        System.out.println(name + " has attack " + pwr);
    }


    public void guard() {
        System.out.println(name + " has block " + pwr);


    }

    public int getDex() {
        return dex;
    }

}

