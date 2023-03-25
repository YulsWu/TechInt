package World;
public final class BlackBear extends LandAnimal{
    // Black bear constructor
    public BlackBear(String n, int w){
        this.weight = w;
        this.name = n;
    };
   
    // Black bear specific attributes, to be assigned at construction
    private int weight;
    private String name;

    // Black bear accessors
    public int getWeight(){
        int retVal = weight;
        return retVal;
    }

    public String getName(){
        String retVal = name;
        return retVal;
    }


    // Inherited abstracts
    protected void move(){
        String moveOn = getHabitat();
        System.out.println(name + " the black bear walks across " + moveOn + ", its " + weight + " pounds shaking the ground as it goes");
    }

    protected Living reproduce(String name, int weight){
        System.out.println(this.name + " finds a mate, and creates a new life, " + name);
        BlackBear newBear = new BlackBear(name, weight);
        return newBear;
    }

    protected void grow(){
        System.out.println("As " + name + " grows, it reaches an impressive size.");
    }

    protected void respond(){
        System.out.println(name + " hears a rustling in the bushes, it lets a low rumbling growl in response, the iterloper flees");
    }

    public Living live(){
        respire();
        move();
        Living babyBear = reproduce("Fuzzy", 410);
        grow();
        respond();
        die();
        return babyBear;
    }

}
