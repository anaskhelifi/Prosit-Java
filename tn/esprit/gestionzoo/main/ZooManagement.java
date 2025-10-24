package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {



        Aquatic aquaticParam = new Aquatic("Fish", "Shark", 10, false);
        Terrestrial terrestrialParam = new Terrestrial("Mammal", "Elephant", 15, true);
        Dolphin dolphinParam = new Dolphin("Mammal", "Dolphin", 8, true);
        Penguin penguinParam = new Penguin("Bird", "Penguin", 4, false);


        System.out.println(aquaticParam);
        System.out.println(terrestrialParam);
        System.out.println(dolphinParam);
        System.out.println(penguinParam);
    }
}
