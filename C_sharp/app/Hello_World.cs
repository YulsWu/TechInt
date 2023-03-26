using System;

namespace World
{
    public class Hello
    {
        public void HelloWorld()
        {
            Console.WriteLine("Hello World!");
        }
    }

    public abstract class Living
    {
        private protected String name;
        private protected int weight;

        public abstract Living live();
        private protected abstract void move();
        private protected abstract Living reproduce(string name, int weight);
        private protected abstract void respond();
        private protected abstract void respire();
        private protected abstract void grow();
        private protected abstract void die(); 
    }

    public abstract class LandAnimal:Living
    {
        private protected String habitat = "Land";

        private protected override void move()
        {
            Console.WriteLine("The animal traverses the earthen terrain.");
        }
        private protected override void respire()
        {
            Console.WriteLine("The animal takes a deep breath of fresh air into its lungs.");
        }
    }

    public sealed class BlackBear:LandAnimal
    {
        public BlackBear(string n, int w)
        {
            this.name = n;
            this.weight = w;
        }
        public BlackBear()
        {
            this.name = "Noname";
            this.weight = 1;
        }
        
        private protected override Living reproduce(string name, int weight)
        {
            Console.WriteLine(this.name + " finds a mate, and brings " + name + " into the world.");
            BlackBear newBear = new BlackBear(name, weight);
            return newBear;
        }
        
        private protected override void respond()
        {
            Console.WriteLine(this.name + " hears something amongst the trees, a mighty roar scares them off.");
        }
        
        private protected override void grow()
        {
            Console.WriteLine("Berries and salmon are plentiful for " + this.name + ", it grows to a healthy " + this.weight + " pounds.");
        }
        
        private protected override void die()
        {
            Console.WriteLine("On a warm summer evening, " + this.name + " finds its final resting place at the base of a great oak at the rivers delta.");
        }

        public override Living live()
        {
            respire();
            move();
            grow();
            Living newBear = reproduce("Fuzzbutt", 521);
            respond();
            die();
            return newBear;
        }


    }
}