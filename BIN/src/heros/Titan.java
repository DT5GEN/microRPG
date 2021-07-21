package heros;

import heros.Paladin;

public class Titan extends Paladin {

    public Titan(String name, int hp, int mp, int pwr, int dex) {
        super(name, hp, mp, pwr, dex);

            }

        public void megaAttack(){

            System.out.println(name + "  has Mega Attack! " );

        }

        @Override
        public void guard() {
            System.out.println(name + " don't block ");
        }

        @Override
        public void heal(int hp) {
        System.out.println(name + " heal up to " + (hp + 30) );
    }
}
