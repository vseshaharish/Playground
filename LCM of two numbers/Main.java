#include<stdio.h>
int main()
{
  int a,b,small,i,c,l;
  scanf("%d%d", &a, &b);
  small = a>b?b:a;
  for(i=small; i>=1; i--)
  {
    if(a%i==0 && b%i==0)
    {
      c=i;
      break;
    }
  }
  l=(a*b)/c;
  printf("%d",l);
  //Type your code here
  return 0;
}