public class Archer extends Hero {


    public Archer(String name, int hp, int mp, int pwr) {
        super(name, hp, mp, pwr);
    }

    void attack () {
        System.out.println(name + " has attack " + pwr);
    }

    void guard () {
        System.out.println(name + " has block " + pwr);
    }
}




