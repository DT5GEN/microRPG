package models;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int mp;
    protected int pwr;

    public Hero () {};

    public Hero(String name, int hp, int mp, int pwr) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.pwr = pwr;
    }

   public void attack () {
        System.out.println(name + " has attack " + pwr);
    }

    public void guard () {
        System.out.println(name + " has block " + pwr);
    }

    abstract protected void heal(int hp) ;

}
