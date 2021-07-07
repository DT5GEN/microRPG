public class Hero {

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

    void attack () {
        System.out.println(name + " has attack " + pwr);
    }

    void guard () {
        System.out.println(name + " has block " + pwr);
    }

}
