#include <stdio.h>
int main() {
  int n,i,a=1,b=1,c=1,s,p,q,x,t,u,d,k,r,y;
  scanf("%d",&n);
   r=n%10;
   for(i=1;i<=r;i++)
   {
     a=a*i;
   }
   s=a;
   p=n/10;
  q=p%10;
  for(x=1;x<=q;x++)
  {
    b=b*x;
  }
  t=b;
  u=p/10;
  for(y=1;y<=u;y++)
  {
    c=c*y;
  }
  d=c;
  k=s+t+d;
  if(k==n)
  printf("Yes");
  else
    printf("No");
	//Type your code
	return 0;
}