 #include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int a[n],i,b,c,d=-1,e=-1;
  for(i=0; i<n; i++)
  {
    scanf("%d", &a[i]);
  }
  scanf("%d%d",&b,&c);
  for(i=0; i<n; i++)
  {
    if(a[i]==b)
      d=i;
    else if(a[i]==c)
      e=i;
  }
  printf("Element 1 index = %d\nElement 2 index = %d",d,e);
  return 0;
}