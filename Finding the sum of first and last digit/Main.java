#include <stdio.h>
int main() {
  int n,d,a,sum;
  scanf("%d",&n);
  d=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  sum=d+n;
  printf("%d",sum);
	//Type your code
	return 0;
}