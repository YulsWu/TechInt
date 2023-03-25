package World;
public abstract class Living {
    public abstract Living live();

    abstract protected void move();
    abstract protected Living reproduce(String name, int weight);
    abstract protected void respond();
    abstract protected void respire();
    abstract protected void grow();
    abstract protected void die();
}
