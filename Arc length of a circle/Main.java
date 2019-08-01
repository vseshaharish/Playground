#include<stdio.h>
int main()
{
  float a,b,c,d;
  scanf("%f%f", &a, &b);
  c=b/360;
  d = 2*3.14*a*c;
  printf("%.2f",d);
  return 0;
}