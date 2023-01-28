import java.lang.*;
/*
 * class Object
 * {
 *   // Code
 * }
 * 
 */
class Single 
{
     public static void main(String arg[]) 
        {
            Base bobj = new Base();     // No casting
            Derived dobj1 = new Derived();  // No casting
            Base bobj2 = new Derived();     // Upcasting
            // Derived dobj2 = new Base();     // Downcasting (Not Allowed )

            dobj1.fun();        // Base fun
            dobj1.gun();        // Derived gun
            dobj1.fun(11);  // Base fun
            dobj1.sun();        // Derived sun

            bobj2.fun();        // BAse fun
            bobj2.fun(11);  // Base fun
            bobj2.gun();       // Derived gun
            // bobj2.sun();       // Derived sun
        }    
}
class Base  // class Base extends Object
{
    public int A , B;
    public Base()
    {
        System.out.println("Base Constructor");
        this.A = 10;
        this.B = 20;
    }
    public void fun()       // Defination
    {
        System.out.println("Inside Base fun");
    }
    public void gun()       // Defination
    {
        System.out.println("Inside Base gun");
    }
    public void fun(int No) // Overloaded Deination
    {
        System.out.println("Inside Base fun with one integer");
    } 
}

class Derived extends Base // class Derived : public Base
{
    public int X , Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
        this.X = 30;
        this.Y = 40;
    }
    public void sun()       // // Defination
    {
        System.out.println("Inside Derived sun ");
    }
    public void gun()       // Overrided Defination
    {
        System.out.println("Inside Derived gun");
    }
}

