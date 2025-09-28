import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount=0;
    private final int NBR_CAGES = 25;
    public Zoo ( String name, String city ,int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages= nbrCages;
        this.animals = new Animal[checkCages(nbrCages)];
    }
    private int checkCages(int nbrCages) {
        if (nbrCages > NBR_CAGES) {
            return NBR_CAGES;
        } else {
            return nbrCages;
        }
    }
    boolean isZooFull() {
        return animalCount >= animals.length;
    }
    boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo est plein.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal c'est deja existe!");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false; // animal not found

        // Shift animals left to fill the gap
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2;
    }
    void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }
    /*boolean addAnimal(Animal animal){
      if (animalCount < nbrCages){
          animals[animalCount]=animal;
          animalCount++;
          return true;
      }
      return false;
    }instruction 11*/

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                ", NBR_CAGES=" + NBR_CAGES +
                '}';
    }
}
