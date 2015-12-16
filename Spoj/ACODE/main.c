//http://www.spoj.com/problems/ACODE/
#include<stdio.h>
#include<string.h>
char a[10000];
int dp[10000];
int getNum(char a, char b){
  int x = 10 * (a-'0');
  return (x + (b-'0'));
}
int main(){
  int n,i,j;
  while(1) {
    for(i=0;i<2000;i++)
    dp[i] = 0;
    scanf("%s",a);
    if(a[0] == '0') break;
    dp[0] = 1;
    for(i=1;i<strlen(a);i++){
      //check if valid 1 digit number
      // number is not 0
      if(a[i] != '0')
      dp[i] += dp[i-1];
      //check if valid 2 digit number
      // and combination with previous number is between 10 and 26
      if(getNum(a[i-1],a[i]) >= 10 && getNum(a[i-1],a[i]) <= 26) {
        if(i-2 < 0 ) dp[i] += dp[0]; else  dp[i] += dp[i-2];
      }
    }
    printf("%d\n",dp[strlen(a) - 1]);
  }
  return 0;
}
