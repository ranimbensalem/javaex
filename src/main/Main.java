package main;

import entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("animal", "lion", -5, true);
        Animal tigger = new Animal("animal", "tigger", 3, true);
        Animal turtle = new Animal("animal", "turtle", 1, false);
        Animal lion1 = new Animal("animal", "lion", 6, true);

        Zoo myZoo = new Zoo("", "tunis", 5);

        System.out.println("Ajout lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout tigger : " + myZoo.addAnimal(tigger));
        System.out.println("Ajout tortue : " + myZoo.addAnimal(turtle));
        System.out.println(myZoo);

        System.out.println("Recherche lion : " + myZoo.searchAnimal(lion));
        System.out.println("Recherche tortue : " + myZoo.searchAnimal(turtle));

        System.out.println("Ajout lion1 : " + myZoo.addAnimal(lion1));
        System.out.println("Suppression de tigger : " + myZoo.removeAnimal(tigger));
        System.out.println(myZoo);

        Zoo myZoo2 = new Zoo("Zoo", "france", 5);
        myZoo2.addAnimal(new Animal("animal", "bear", 2, true));
        myZoo2.addAnimal(new Animal("animal", "lapin", 4, true));

        Zoo bigZoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println("Zoo avec le plus d'animaux : " + bigZoo.getName());

        System.out.println("myZoo est plein : " + myZoo.isZooFull());
        System.out.println("myZoo2 est plein : " + myZoo2.isZooFull());

        Aquatic fish = new Dolphin("aquatic", "fish", 2, false, "ocean", 5);
        Terrestrial cat = new Terrestrial("terrestrial", "cat", 3, true, 4);
        Dolphin dolphin = new Dolphin("aquatic", "flipper", 5, true, "sea", 10);
        Penguin penguin = new Penguin("aquatic", "ping", 4, false, "antarctica", 15);

        System.out.println(fish);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(penguin);

        fish.swim();
        dolphin.swim();
        penguin.swim();

        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        myZoo.showAquaticSwim();
        System.out.println("Max penguin depth:" + myZoo.getMaxPenguinDepth());
        myZoo.displayNumberByType();
    }
}
