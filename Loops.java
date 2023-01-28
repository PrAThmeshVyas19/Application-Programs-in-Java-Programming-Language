class Loops
{
    public static void main(String Arg[])
    {

        int Arr[] ={10,20,30,40};
        int iCnt =0;

        System.out.println("Travelsal of array using for loop");
        for(iCnt =0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        System.out.println("Travelsal of array using while loop");
        iCnt =0;
        while(iCnt < Arr.length)
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
        System.out.println("Travelsal of array using do while loop");
        iCnt = 0;
        do
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt <Arr.length);

        System.out.println("Using for each loop");
        for(int iNo : Arr)  // Only in java
        {
            System.out.println(iNo);
        }
    }
}
