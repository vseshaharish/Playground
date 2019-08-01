#include<stdio.h>
int main()
{
  int i,j;
  char str[100];
  scanf("%[^\n]s", str);
  for(i=0; str[i]!='\0'; i++)
  {
    while(str[i] == 'a' || str[i] == 'e' || str[i] == 'o' || str[i] == 'u' || str[i] == 'i'||
      str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' ||str[i] == 'U')
    {
      for(j=i;str[j]!='\0';++j)
      {
      str[j]=str[j+1];
      }
    }
  }
  printf("%s",str);
  //Type your code here
  
  return 0;
}