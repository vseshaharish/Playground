#include <stdio.h>
int main()
{
 int i,j,k;
  char s[10],c[10],h[20];
  scanf("%s%s%s",s,c,h);
  i=0;
  while(s[i]!='\0')
  {
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||
      s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
    {
      s[i]='$';
    }
    i++;
  }
  j=0;
    while(c[j]!='\0')
  {
    if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'||
      c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')
    {
      c[j]=c[j];
    }
      else
      {
        c[j]='#';
      }
    j++;
  }
  k=0;
  while(h[k]!='\0')
  {
    if(h[k]>='a' && h[k]<='z')
    {
      h[k]=h[k]-32;
    }
    k++;
  }
  printf("%s",s);
  printf("%s",c);
  printf("%s",h);
   return 0;
}