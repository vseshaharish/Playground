#include<stdio.h>
int main()
{
  int a,n,l,c;
  scanf("%d",&a);
  n=a%1000;
  l=n/10;
  c=l%10;
  printf("%d",c);
  //Type your code here
  return 0;
}