
class Multi
{
    public static void main(String arg[])
    {
        // Arr is 2D array which contains 3 1D array , each 1d array contains 4 elements
        // Each element is of type int
        
        // Allowed is C & C++
        // int Arr[3][4] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        // Allowed in only java
        int Arr[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        System.out.println(Arr.length);     // 3
        System.out.println(Arr[0].length);  // 4
    }
}
