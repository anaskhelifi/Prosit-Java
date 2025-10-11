package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {    
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvedere", "Tunis");
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        System.out.println(zoo1.addAnimal(lion));
        System.out.println(zoo1.addAnimal(tiger));
        System.out.println(zoo1.addAnimal(elephant));
        System.out.println(zoo1.addAnimal(lion));

        zoo1.displayAnimals();

        System.out.println(zoo1.searchAnimal(tiger));
        System.out.println(zoo1.removeAnimal(tiger));
        zoo1.displayAnimals();

        Zoo zoo2 = new Zoo("Friguia", "Sousse");
        zoo2.addAnimal(new Animal("Canidae", "Wolf", 3, true));
        System.out.println(Zoo.comparerZoo(zoo1, zoo2));
    }
}
