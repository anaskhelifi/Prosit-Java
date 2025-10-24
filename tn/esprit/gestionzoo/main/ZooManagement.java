package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("MyZoo", "Tunis");

        Dolphin dolphin1 = new Dolphin("Mammal", "Flipper", 5, true);
        Dolphin dolphin2 = new Dolphin("Mammal", "Blue", 6, true);
        Penguin penguin1 = new Penguin("Bird", "Pingu", 3, false, 20f);
        Penguin penguin2 = new Penguin("Bird", "Skipper", 4, false, 35f);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        zoo.makeAllSwim();

        System.out.println("Max penguin swimming depth: " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();
    }
}
