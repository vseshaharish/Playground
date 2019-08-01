#include <stdio.h>
int main() {
  int n,d,a,b;
  scanf("%d",&n);
  if(n<=99)
  {
  d=n%10;
  printf("%d",d);
  }
else
{
  a=n/1000;
  b=a%10;
  printf("%d",b);
}
	//Type your code
	return 0;
}