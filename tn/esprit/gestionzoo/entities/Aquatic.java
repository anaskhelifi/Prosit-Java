package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return getAge() == aquatic.getAge() &&
                getName().equals(aquatic.getName()) &&
                ((habitat == null && aquatic.habitat == null) || (habitat != null && habitat.equals(aquatic.habitat)));
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}
