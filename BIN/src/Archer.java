import models.Hero;

public class Archer extends Hero {


    private int hp;

    public Archer(String name, int hp, int mp, int pwr) {
        super(name, hp, mp, pwr);
    }

    @Override
    protected void heal(int hp) {
        System.out.println(name + " heal up to " + hp );
    }

    public void attack() {
        System.out.println(name + " has attack " + pwr);
    }

    public void guard() {
        System.out.println(name + " has block " + pwr);
    }
}



