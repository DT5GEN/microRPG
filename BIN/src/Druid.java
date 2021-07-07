public class Druid extends Hero {


    public Druid(String name, int hp, int mp, int pwr) {
        super(name, hp, mp, pwr);
    }

    void attack () {
        System.out.println(name + " has attack " + pwr);
    }

    void guard () {
        System.out.println(name + " has block " + pwr);
    }
}

