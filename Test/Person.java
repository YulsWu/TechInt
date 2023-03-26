package Test;

public class Person implements Alive {
    private int age;
    private String name;
    private char sex;

    public Person(String n, int a, char s){
        age = a;
        name = n;
        sex = s;
    }

    public int getAge(){
        int retVal = age;
        return retVal;
    }
    public String getName(){
        String retVal = name;
        return retVal;
    }
    public char getSex(){
        char retVal = sex;
        return retVal;
    }

    public void summary(Summarizable l){
        l.summarize(name, age, sex);
    }
}
