package entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() { return swimmingDepth; }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming .");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth= " + swimmingDepth;
    }
}
