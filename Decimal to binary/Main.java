#include<stdio.h>
int main()
{
  int n,a[100],i,rem_count=0;
  scanf("%d", &n);
  while(n!=0)
  {
    a[rem_count++]=n%2;
    n=n/2;
  }
  for(i=rem_count-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  //Type your code here
  return 0;
}