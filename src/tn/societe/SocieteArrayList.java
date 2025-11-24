package tn.societe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(liste, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int c = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (c != 0) return c;
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
