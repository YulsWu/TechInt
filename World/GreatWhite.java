package World;
public final class GreatWhite extends SeaAnimal {
    public GreatWhite(String n, int w){
        this.name = n;
        this.weight = w;
    }

    private String name;
    private int weight;
    
    // Accessors
    public String getName(){
        String retVal = this.name;
        return retVal;
    }
    public int getWeight(){
        int retVal = this.weight;
        return retVal;
    }

    // Inherited abstracts
    protected void move(){
        String moveOn = getHabitat();
        System.out.println(this.name + " the great white swings its powerful tail, propelling itself forward through the " + moveOn);
    }
    protected Living reproduce(String name, int weight){
        System.out.println(this.name + " finds a mate, and creates a new life, " + name);
        Living newShark = new GreatWhite(name, weight);
        return newShark;
    }
    protected void respond(){
        System.out.println(this.name + " smells the scent of blood on the water, and rushes towards its next meal.");
    }
    protected void grow(){
        System.out.println("After years of feasting and frenzying, " + this.name + " has grown to " + this.weight + "lbs.");
    }

    public Living live(){
        respire();
        move();
        Living babyShark = reproduce("Finn", 322);
        grow();
        respond();
        die();
        return babyShark;
    }
}
