#include<stdio.h>
int main()
{
  int count = 0,i;
  char s[20];
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0'; i++)
    {
      count++;
    }
  printf("%d",count);
  //Type your code here
  return 0;
}