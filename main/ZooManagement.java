package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        Zoo myZoo = new Zoo("My Zoo", "Tunis");
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(tiger);

        myZoo.displayZoo();
        myZoo.displayAnimals();

        Animal searchLion = new Animal("Felidae", "Lion", 5, true);
        System.out.println(myZoo.searchAnimal(searchLion));

        Animal duplicateLion = new Animal("Felidae", "Lion", 5, true);
        System.out.println(myZoo.searchAnimal(duplicateLion));

        boolean added = myZoo.addAnimal(duplicateLion);
        System.out.println(added);

        boolean removed = myZoo.removeAnimal(elephant);
        System.out.println(removed);

        System.out.println(myZoo.isZooFull());

        Zoo anotherZoo = new Zoo("Another Zoo", "Sfax");
        anotherZoo.addAnimal(new Animal("Canidae", "Wolf", 6, true));

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        biggerZoo.displayZoo();
    }
}
