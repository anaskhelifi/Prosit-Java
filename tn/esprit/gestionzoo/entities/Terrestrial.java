package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }

}
