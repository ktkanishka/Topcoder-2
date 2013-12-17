/*
2 - implement the function void reverse(char * str) in C which reverses a null terminated string
*/

#include<stdio.h>
#include<string.h>

int getStrLen(char *str){
	int len=0;
	while(str[len++]!='\0');
	return len-1;
}

void reverse(char* str){
	int len = getStrLen(str);
	char temp;
	int i;
	for(i=0;i<len/2;i++)
	{
		temp = str[i];
		str[i] = str[len-i-1];
		str[len-i-1] = temp;
	}
}

int main() {
	char a[100] = "sdsbvjkbsj\0";
	reverse(a);
	printf("%s\n",a);
return 0;
}