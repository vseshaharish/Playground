#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,d;
  scanf("%f%f", &a, &b);
  c = (a*a)+(b*b);
  d=sqrt(c);
  printf("%.2f",d);
  //Type your code here
  return 0;
}