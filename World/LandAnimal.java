package World;
public abstract class LandAnimal extends Living {

    private static String habitat = "Land";

    public static String getHabitat(){
        String retVal = habitat;
        return retVal;
    }

    protected void respire(){
        System.out.println("The animal takes a deep breath of fresh air");
    };

    protected void die(){
        System.out.println("The animal knows its time is here, it finds a shaded area under a great oak, and passes on to the next world");
    };

    /* 
    public abstract Living live();
    abstract protected void move();
    abstract protected Living reproduce(String name, int weight);
    abstract protected void respond();
    abstract protected void grow();
    */
}
