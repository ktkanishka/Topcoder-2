//https://www.hackerrank.com/challenges/extra-long-factorials

#include<stdio.h>
int a[10000];
int main() {
	int n;
	scanf("%d", &n);
	int i,j,k;
	a[0] = 1;
	int carry = 0;
	int high = 0;
	for(i=1;i<=n;i++){

		for(k=0;k<=high;k++){
			int prod = (a[k] * i) + carry;
			a[k] =  prod % 10;
			carry = prod / 10;
		}
		while(carry != 0){
			a[high+1] = carry % 10;
			high = high + 1;
			carry = carry / 10;
		}

	}

	for(i=high;i>=0;i--){
		printf("%d",a[i]);
	}
	printf("\n");
	return 0;
}
