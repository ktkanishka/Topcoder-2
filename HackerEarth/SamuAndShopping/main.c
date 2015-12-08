//https://www.hackerearth.com/code-monk-dynamic-programming/algorithm/samu-and-shopping/
#include <stdio.h>

int a[1000000][3];

int min(int a,int b){
if(a < b) return a; else return b;
}


int main()
{
	int t,n,i,j;
	scanf("%d",&t);
	while(t--){
		scanf("%d",&n);
		scanf("%d%d%d",&a[0][0],&a[0][1],&a[0][2]);
		for(i=1;i<n;i++){
			scanf("%d%d%d",&a[i][0],&a[i][1],&a[i][2]);
			a[i][0] = min(a[i-1][1],a[i-1][2]) + a[i][0];
			a[i][1] = min(a[i-1][0],a[i-1][2]) + a[i][1];
			a[i][2] = min(a[i-1][0],a[i-1][1]) + a[i][2];
		}
		printf("%d\n",min(min(a[n-1][0],a[n-1][1]),a[n-1][2]));
	}
	return 0;
}
