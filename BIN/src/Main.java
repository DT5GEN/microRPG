import heros.Archer;
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

       Hero []  attackGroup = {archer, paladin, druid, killer, titan};

        for (int i = 0; i < attackGroup.length; i++) {
            attackGroup[i].attack();
            attackGroup[i].guard();
            if (attackGroup[i] instanceof Titan) {


               Titan titan1 = (Titan) attackGroup[i];
               titan1.megaAttack();
 //               ((Titan)  attackGroup[i]).megaAttack();
            }
        }

        archer.attack();
        paladin.attack();
        druid.attack();
        titan.megaAttack();
        druid.guard();
        titan.guard();

        archer.heal(15);
//        paladin.heal(20);



        System.out.println("Lovkost paladina = " + paladin.getDex());


        int a = 5;
        String str = "Halwing";

        Object[] arr = new Object[7];
        arr[0] = a;
        arr[1] = str;
        arr[2] = archer;
        arr[3] = paladin;
        arr[4] = attackGroup;
        arr[5] = druid;



    }

}
