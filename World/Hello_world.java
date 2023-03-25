package World;
class World {

    public static void main(String[] args){
        Living bear = new BlackBear("Griswold", 562);
        Living shark = new GreatWhite("Jett", 322);

        Living newBear = bear.live();
        Living newShark = shark.live();

        newBear.live();
        newShark.live();
    }
}