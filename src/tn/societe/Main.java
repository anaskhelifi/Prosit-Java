package tn.societe;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet dhs = new DepartementHashSet();

        Departement d1 = new Departement(3, "Finance", 8);
        Departement d2 = new Departement(1, "IT", 10);
        Departement d3 = new Departement(2, "RH", 5);

        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);

        System.out.println("Liste des départements:");
        dhs.displayDepartement();

        System.out.println("\nTri par ID:");
        TreeSet<Departement> sorted = dhs.trierDepartementById();
        for (Departement d : sorted) {
            System.out.println(d);
        }
    }
}

