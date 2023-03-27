using System;
using World;

namespace MainNamespace
{
    public class MainClass
    {
        public static void Main(string[] args)
        {
            Hello myHello = new Hello();
            myHello.HelloWorld();
            
            BlackBear myBear = new BlackBear("FuzzyWuzzy", 482);
            myBear.live();
           
        }
    }
}