#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,t1,t2,s,e;
  scanf("%d", &n);
  if(n%2 == 1)
  {
    a=1;r=2;
    t1 = (n+1)/2;
    s = a*(pow(r,t1-1));
     printf("%d",s);
  }
  else
  {
    a=1;r=3;
    t2 = n/2;
    e = a*(pow(r,t2-1));
    printf("%d",e);
  }
    
  //type your code here
  return 0;
}