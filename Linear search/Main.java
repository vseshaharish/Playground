#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int a[n],i,b,c=0,d;
  for(i=0; i<n; i++)
  {
    scanf("%d", &a[i]);
  }
  scanf("%d", &b);
  for(i=0; i<n; i++)
  {
    if(a[i]==b)
    {
      d=i;
    c++;
    }
  }
  if(c==0)
  {
    printf("%d",b);
  printf(" isn't present in the array.");
  }
  else
    printf("%d",d+1);
  //Type your code here
  return 0;
}