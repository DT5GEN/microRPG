package heros;

import models.Hero;

public class Druid extends Hero {


    public Druid(String name, int hp, int mp, int pwr) {
        super(name, hp, mp, pwr);
    }

    public void attack() {
        System.out.println(name + " has attack " + pwr);
    }

    public void guard() {
        System.out.println(name + " has block " + pwr);
    }

    @Override
    protected void heal(int hp) {
        System.out.println(name + " heal up to " + (hp + 30) );
    }
}

