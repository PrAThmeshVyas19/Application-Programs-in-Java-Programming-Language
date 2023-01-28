#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[5] = {'a','b','c','d','\0'};

    char Brr[5] = "abcd";

    char Crr[] = "abcd";

    printf("%s\n",Arr);
    printf("%s\n",Brr);
    printf("%s\n",Crr); 

    printf("Size of Arr : %d\n",sizeof(Arr));
    printf("Size of Brr : %d\n",sizeof(Brr));
    printf("Size of Crr : %d\n",sizeof(Crr));
    
    printf("Size of Arr : %d\n",strlen(Arr));
    printf("Size of Brr : %d\n",strlen(Brr));
    printf("Size of Crr : %d\n",strlen(Crr));

    return 0;
}