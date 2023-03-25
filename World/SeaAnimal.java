package World;
public abstract class SeaAnimal extends Living {
    private static String habitat = "Sea";

    public static String getHabitat(){
        String retVal = habitat;
        return retVal;
    }

    protected void respire(){
        System.out.println("The animal gulps down a mawful of cold water and pushes it through its gills");
    }

    protected void die(){
        System.out.println("This animal is old and weary, it swims as deep as it can, and into the beyond");
    }

    public abstract Living live();
    abstract protected void move();
    abstract protected Living reproduce(String name, int weight);
    abstract protected void respond();
    abstract protected void grow();
}
