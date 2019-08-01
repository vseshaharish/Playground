#include<stdio.h>
#include<math.h>
int main()
{
  int a,i=0,rem,sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    rem=a%10;
    sum=sum+rem*pow(2,i);
    a=a/10;
    i++;
  }
  printf("%d",sum);
  //Type your code here
  return 0;
}