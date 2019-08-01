#include<stdio.h>
int main()
{
  int a,n,sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    n=a%10;
  sum=sum+n;
  a=a/100;
  }
  printf("%d",sum);
  //Type your code here
  return 0;
}