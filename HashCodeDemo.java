class HashCodeDemo 
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo(11,21);

        System.out.println("HashCode of the obj is : "+obj.hashCode());
    }
}

class Demo
{
    public int No1;
    public int No2;

    public Demo(int a , int b)
    {
        No1 = a;
        No2 = b;
    }
}