import heros.Druid;
import heros.Paladin;
import heros.Titan;
import models.Hero;

public class Main {

    public static void main(String[] args) {

        Archer archer = new Archer("Link", 200, 30, 25);
        Paladin paladin = new Paladin("Artur", 230, 20, 30);
        Druid druid = new Druid("Pendal", 150, 100, 40);
        Titan titan = new Titan("Титанище", 250, 60, 100, 50);
        Paladin killer = new Paladin("killer", 200, 100, 500, 100);

      //  Hero hero = new Hero("Our hero", 5, 5, 5);


        archer.attack();
        paladin.attack();
        druid.attack();
        titan.megaAttack();
        druid.guard();
        titan.guard();

        archer.heal(15);

        System.out.println("Lovkost paladina = " + paladin.getDex());

    }

}
