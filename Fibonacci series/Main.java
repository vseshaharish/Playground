#include<stdio.h>
int main()
{
  int n,i,t1=0,t2=1,next;
  scanf("%d", &n);
  printf("%d %d ",t1,t2);
  for(i=3; i<=n; i++)
  {
    next = t1+t2;
    t1 = t2;
    t2 = next;
    printf("%d ",next);
  }
  //Type your code here
  return 0;
}