package tn.societe;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        AffectationHashMap gestion = new AffectationHashMap();

        Employe e1 = new Employe(3, "Ali", "A.", "Informatique", 1);
        Employe e2 = new Employe(1, "Sami", "S.", "Finance", 2);
        Employe e3 = new Employe(2, "Mourad", "M.", "RH", 3);

        Departement d1 = new Departement(10, "Informatique", 5);
        Departement d2 = new Departement(20, "Finance", 3);
        Departement d3 = new Departement(30, "RH", 4);

        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);
        gestion.ajouterEmployeDepartement(e3, d3);

        TreeMap<Employe, Departement> sorted = gestion.trierMap();
        System.out.println("Map triée:");
        for (Map.Entry<Employe, Departement> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
