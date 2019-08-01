#include<stdio.h>
int main()
{
  int i,c=1,j;
  char s[50];
  scanf("%s",s);
  for(i=0; s[i]!='\0'; i++);
  {
    if(i>20)
    {
     printf("Invalid Input");
    }
    else
    {
      for(i=0;i<20; i++)
      {
        if(s[i]==s[i+1])
        {
          c++;
        }
        else
        {
          printf("%c%d",s[i],c);
          c=1;
        }
      }
    }
  }
        return 0;
	//type your code here
}