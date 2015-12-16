//http://www.spoj.com/problems/ABA12C/
#include<stdio.h>
int price[100000];
int cache[100000];
int MAX = 99999;
int main(){
	int n,i,t,k;
	scanf("%d",&t);

	while(t--) {
	for(i=0;i<100000;i++)
		cache[i] = -1;
	scanf("%d%d",&k,&n);
	for(i=0;i<n;i++) {
		scanf("%d",&price[i]);
		if(price[i] == -1)
			price[i] = MAX;
	}
	int tmp = solve(n);
	if(tmp == MAX)
	printf("-1\n");
	else
	printf("%d\n",tmp);
	}
	return 0;
}

int solve(int n){
	if(n <= 0)
		return 0;
	if(cache[n] != -1)
		return cache[n];
	int i,maxi = MAX;
	for(i=0;i<n;i++){
		maxi = min(maxi,price[i] + solve(n-i-1));
	}
	cache[n] = maxi;
	return maxi;
}

int min(int a,int b){
	if(a < b) return a; else return b;
}
