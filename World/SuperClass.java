package World;
public interface SuperClass {
    String myString = "This is a final string in the superclass interface"; // Implied to be Final, public

    public default void myMethod(){
        System.out.println("My Method in Superclass interface");
    }
}
