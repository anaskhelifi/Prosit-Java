package tn.societe;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList s = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Ahmed", "IT", 5);
        Employe e2 = new Employe(2, "Samar", "Fathi", "RH", 3);
        Employe e3 = new Employe(3, "Nour", "Hatem", "Finance", 4);

        s.ajouterEmploye(e1);
        s.ajouterEmploye(e2);
        s.ajouterEmploye(e3);

        System.out.println("Liste des employés:");
        s.displayEmploye();

        System.out.println("\nRecherche par nom (Ali): " + s.rechercherEmploye("Ali"));
        System.out.println("Recherche par employé (e2): " + s.rechercherEmploye(e2));

        System.out.println("\nTri par ID:");
        s.trierEmployeParId();
        s.displayEmploye();

        System.out.println("\nTri par Département puis Grade:");
        s.trierEmployeParNomDépartementEtGrade();
        s.displayEmploye();

        System.out.println("\nSuppression de e1");
        s.supprimerEmploye(e1);
        s.displayEmploye();
    }
}
