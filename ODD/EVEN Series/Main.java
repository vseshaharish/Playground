#include<stdio.h>
int main()
{
  int n,i,d,e,f;
  scanf("%d", &n);
  if(n % 2 !=0)
  {
    for(i=0; i<=n; i++)
    {
      d = i;
    }
    printf("%d",d-1);
  }
    else if(n % 2 == 0)
    {
      for(i=2; i<=n; i++)
      {
        e=i;
      }
  f=(e-2)/2;
  printf("%d",f);
    }
  return 0;
  
	//type your code here
	
}