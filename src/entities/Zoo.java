package entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount = 0;
    private final int NBR_CAGES = 25;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[checkCages(nbrCages)];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Nom du Zoo ne peut pas être vide. ");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = checkCages(nbrCages);
    }

    private int checkCages(int nbrCages) {
        return Math.min(nbrCages, NBR_CAGES);
    }

    public boolean isZooFull() {
        return animalCount >= animals.length;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo est plein.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal existe déjà");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2;
    }

    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[aquaticCount++] = aquatic;
    }
    public void showAquaticSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float getMaxPenguinDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float d = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (d > max) max = d;
            }
        }
        return max;
    }
    public void displayNumberByType() {
        int penguins = 0, dolphins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) penguins++;
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
        }
        System.out.println("Number of penguins: " + penguins);
        System.out.println("Number of dolphins: " + dolphins);
    }


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
