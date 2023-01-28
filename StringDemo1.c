#include<stdio.h>

int main()
{
    char Arr[6] = "Hello";
    char * Ptr = Arr;
    int iCnt = 0;

    while (*Ptr != '\0')
    {
        iCnt++;
        Ptr++;
    }
    
    printf("Lengthof string is : %d\n",iCnt);

    return 0;
}