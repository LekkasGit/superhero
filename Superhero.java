public class Superhero
{
    String superheroName;
    String superheroSuperpower;
    int superheroStrength;
    
    // Constructor method (to create new superhero object)
    public Superhero(String name, String superpower, int strength) {
        superheroName = name;
        superheroSuperpower = superpower;
        superheroStrength = strength;
    }
    
    // Walk method
    public void walk() {
        System.out.println(superheroName + " walks");
    }
    
    // Run method
    public void run() {
        System.out.println(superheroName + " runs");
    }
    
    // Jump method
    public void jump() {
        System.out.println(superheroName + " jumps");
    }
}
