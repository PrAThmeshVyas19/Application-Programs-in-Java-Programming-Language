 class EqualsDemo 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";        // 1001
        String s2 = "Hello";        // 1001

        System.out.println("Hashcode of s1 : "+s1.hashCode());
        System.out.println("Hashcode of s2 : "+s2.hashCode());

        if(s1.equals(s2))       // if("Hello" == "Hello")
        {
            System.out.println("Objects are same");
        }
        else
        {
            System.out.println("Objects are different");
        }

        if(s1 == s2)        // if( 1001 == 1001)
        {
            System.out.println("Objects are same");
        }
        else
        {
            System.out.println("Objects are different");
        }
    }
}
