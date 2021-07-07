public class Main {

    public static void main(String[] args) {

        Archer archer = new Archer("Link", 200, 30, 25);
        Paladin paladin = new Paladin("Artur", 230, 20, 30);
        Druid druid = new Druid("Pendal", 150, 100, 40);
        Paladin killer = new Paladin("Killer", 250, 60, 100, 50);

        archer.attack();
        paladin.attack();
        druid.attack();

        System.out.println("Lovkost paladina = " + paladin.getDex());

    }

}
