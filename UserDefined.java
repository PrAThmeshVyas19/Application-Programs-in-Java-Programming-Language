import java.util.*;

class UserDefined 
{
   public static void main(String[] args) 
   {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                throw new AgeInvalid("Your age is less yjan 15");
            }
            else
            {
                System.out.println("Age is Valid");
            }
        }
        catch(AgeInvalid obj)
        {
            System.out.println(obj);
        }
   } 
}
class AgeInvalid extends Exception
{
    AgeInvalid(String str)
    {
        super(str);
    }
}
    
