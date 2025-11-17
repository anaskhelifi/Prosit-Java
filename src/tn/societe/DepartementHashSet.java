package tn.societe;

import java.util.HashSet;


public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> liste = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        liste.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : liste) {
            if (d.getNomDepartement().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return liste.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        liste.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}
