package Test;

public class Main {
    public static void main(String[] args){
        Example<Integer> ex1 = new Example<Integer>();
        int x = 5;
        ex1.setAttr(x);

        // Testing boxing
        String type1 = ex1.attr1.getClass().getName();
        System.out.println("Within the class: " + type1);

        // Testing unboxing
        int y = ex1.getAttr();
        System.out.println("Value of int y: " + y);
    }
}
