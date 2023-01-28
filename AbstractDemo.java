// Abstract class is a class which contains 0 or more abstract method in it

public class AbstractDemo 
{
    public static void main(String arr[]) 
    {
        Marvellous mobj = new Marvellous();
        int Ret = 0;
        Ret = mobj.Addition(11, 10);
        System.out.println("Additipn is : "+Ret);
        Ret = mobj.Substraction(11, 10);
        System.out.println("Substraction is : "+Ret);
    }
}

abstract class Arithematic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1 , int No2);
}
class Marvellous extends Arithematic
{
    public int Substraction(int No1 , int No2)
    {
        return No1 - No2;
    }
}