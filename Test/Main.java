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

        Person a = new Person("Jack", 12, 'm');
        Animal b = new Animal("Rover", 5, 'f');
        Person c = new Person("Alphonse", 22, 'm');
        Person d = new Person("Liam", 51, 'm');
        Animal e = new Animal("Bessie", 10, 'f');

        Alive[] manifest = new Alive[]{a, b, c, d, e};

        for (Alive al : manifest){
            if (al instanceof Person p){
                p.summary((name, age, sex) -> { System.out.println("Person " + name + " is " + age + " years old, and has sex " + sex + "." );});
            } else if (al instanceof Animal an){
                an.summary((name, age, sex)->{ System.out.println("Animal " + name + " is " + age + " years old, and is of sex " + sex + ".");});
            } else {
                System.out.println("Neither person nor Animal detected...");
            }
        }
    }
}
