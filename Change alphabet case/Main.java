#include <stdio.h>
int main() {
  char ch;
  scanf("%c", &ch);
  if(ch >= 'A' && ch <= 'Z')
  {
    printf("%c",ch+32);
  }
  else if(ch>='a' && ch<='z')
  {
    printf("%c",ch-32);
  }
	// Type your code here
	return 0;
}