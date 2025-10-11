package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private int animalCount;
    private String name;
    private String city;
    public static final int NBR_CAGES = 25;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= NBR_CAGES) return false;
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + NBR_CAGES + "]");
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + NBR_CAGES + "]";
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) return i;
        }
        return -1;
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

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) return z1;
        else return z2;
    }
}
