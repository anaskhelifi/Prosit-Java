package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
