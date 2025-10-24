package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

}
