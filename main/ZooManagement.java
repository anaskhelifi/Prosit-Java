package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {


        Animal lion = new Animal("Felidae", "Lion", 5, true);


        Zoo myZoo = new Zoo("My Zoo", "Tunis", 25);


        myZoo.animals[0] = lion;


        myZoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        System.out.println(lion);
        System.out.println(lion.toString());


        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        myZoo.animals[1] = elephant;


        for (int i = 0; i < myZoo.animals.length; i++) {
            if (myZoo.animals[i] != null) {
                System.out.println(myZoo.animals[i]);
            }
        }
    }
}
