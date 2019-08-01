#include<stdio.h>
#include<math.h>
int main()
{
  int b,i,e=0,c,j,a,arry[100];
  int s=0;
  scanf("%d", &b);
  while(b!=0)
  {
    a = b%10;
    s = s + a*pow(2,e);
    e++;
    b = b/10;
  }
  i=0;
  while(s!=0)
  {
    arry[i++] =s%8 ;
    s = s/8;
  }
  for(j=i-1; j>=0; j-- )
  {
    printf("%d",arry[j]);
  }
  return 0;
  //Type your code here
}