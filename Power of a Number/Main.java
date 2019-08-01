#include <stdio.h>
#include<math.h>
int main()
{
  long int b,e,c;
  scanf("%ld%ld", &b, &e);
  if(e>=0)
  {
  c=pow(b,e);
  printf("%ld",c);
  }
  else
    printf("Wrong input");
  	//Your code here       
    return 0;
}