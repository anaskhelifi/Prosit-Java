package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

}
