import java.util.*;

public class main {
    public static void main(String[] args) {
        hero hero1 = new hero("Surya", 100);
        hero hero2 = new hero("Putra", 90);

        hero heroAgility = new hero("Test 1", 100);
        hero heroIntel = new hero("Test 2", 100);

        ArrayList<hero> listHero = new ArrayList<>();

        //add
        System.out.println("Operasi 1: add");
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(heroAgility);

        System.out.println(listHero);
        System.out.println();

        //set
        System.out.println("Operasi 2: set");
        listHero.set(1, heroIntel);
        System.out.println(listHero);
        System.out.println();

        //remove
        System.out.println("Operasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero);
        System.out.println();

        //get
        System.out.println("Operasi 4: get");
        System.out.println(listHero);
        hero heroAmbil = listHero.get(0);
        heroAmbil.setName("XV");
        System.out.println(listHero);
        heroAmbil.display();
        System.out.println();

        //method
        System.out.println("Method: ");
        System.out.println("1. size()\t:" + listHero.size());
        System.out.println("2. isEmpty()\t:" + listHero.isEmpty());
        System.out.println("3. contains(hero2)\t:" + listHero.contains(hero2));
        System.out.println("   contains(heroAgility)\t:" + listHero.contains(heroAgility));
        System.out.println("4. indexOf(hero1)\t:" + listHero.indexOf(hero1));
        System.out.println("   indexOf(heroAgility)\t:" + listHero.indexOf(heroAgility));

        for (hero list : listHero) {
            System.out.println(list);
        }
    }
}
