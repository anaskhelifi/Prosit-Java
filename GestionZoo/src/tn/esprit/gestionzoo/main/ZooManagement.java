package tn.esprit.gestionzoo.main;

import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");

        System.out.print("Entrez le nom du zoo : ");
        String inputName = sc.nextLine().trim();
        while (inputName.isEmpty()) {
            System.out.print("Le nom du zoo ne peut pas être vide. Réessayez : ");
            inputName = sc.nextLine().trim();
        }

        System.out.print("Entrez le nombre de cages : ");
        while (!sc.hasNextInt()) {
            System.out.print("Veuillez entrer un entier positif : ");
            sc.next();
        }
        int inputCages = sc.nextInt();
        while (inputCages <= 0) {
            System.out.print("Le nombre de cages doit être positif. Réessayez : ");
            while (!sc.hasNextInt()) {
                System.out.print("Veuillez entrer un entier positif : ");
                sc.next();
            }
            inputCages = sc.nextInt();
        }

        sc.close();

        zoo.zooName = inputName;
        zoo.nbrCages = inputCages;

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
    }
}
