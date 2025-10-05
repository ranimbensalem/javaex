package main;

import entities.Animal;
import entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("animal", "lion", -5, true);
        Animal tigger = new Animal("animal", "tigger", 3, true);
        Animal turtle = new Animal("animal", "turtle", 1, false);
        Animal lion1 = new Animal("animal", "lion", 6, true);
        Zoo myZoo = new Zoo("", "tunis", 5);
        System.out.println("ajout lion: " + myZoo.addAnimal(lion));
        System.out.println("ajout tigger: " + myZoo.addAnimal(tigger));
        System.out.println("ajout torture: " + myZoo.addAnimal(turtle));
        System.out.println(myZoo);
        System.out.println("recherche lion " + myZoo.searchAnimal(lion));
        System.out.println("recherche torture " + myZoo.searchAnimal(turtle));
        System.out.println("lion1: " + myZoo.addAnimal(lion1));
        System.out.println("supprimer le tigger: " + myZoo.removeAnimal(tigger));
        System.out.println(myZoo);
        Zoo myZoo2 = new Zoo("Zoo ", "france", 5);
        myZoo2.addAnimal(new Animal("animal", "bear", 2, true));
        myZoo2.addAnimal(new Animal("animal", "lapin", 4, true));
        Zoo bigZoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println("zoo avec beaucoup des animaux " + bigZoo.getName());
        System.out.println("myZoo est plein: " + myZoo.isZooFull());
        System.out.println("myZoo2 est plein: " + myZoo2.isZooFull());
    }
}
