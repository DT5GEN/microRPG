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

    void attack () {
        System.out.println(name + " has attack " + pwr);
    }


    void guard () {
        System.out.println(name + " has block " + pwr);


    }

    public int getDex() {
        return dex;
    }

}

