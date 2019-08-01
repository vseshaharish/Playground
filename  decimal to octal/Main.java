#include<stdio.h>
int main()
{
  int a,n[100],i,rem_count=0;
  scanf("%d",&a);
  while(a!=0)
  {
    n[rem_count++]=a%8;
    a=a/8;
  }
  for(i=rem_count-1;i>=0;i--)
  {
    printf("%d",n[i]);
  }
  //type your code here
  return 0;
}