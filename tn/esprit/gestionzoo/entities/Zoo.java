package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private Animal[] animals;
    private int animalCount;

    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        if (name != null && !name.isEmpty()) this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= nbrCages) return false;
        animals[animalCount++] = animal;
        return true;
    }

    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= aquaticAnimals.length) return false;
        aquaticAnimals[aquaticCount++] = aquatic;
        return true;
    }

    public void makeAllSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > max) max = depth;
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins);
        System.out.println("Penguins: " + penguins);
    }
}
