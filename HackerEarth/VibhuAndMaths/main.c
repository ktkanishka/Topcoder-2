//https://www.hackerearth.com/code-monk-dynamic-programming/algorithm/vibhu-and-his-mathematics/description/
#include <stdio.h>
long long a[1000005];
int main()
{
    long long t,n;
    int i;
    a[0] = 1;
    a[1] = 1;
    for(i=2;i<=1000000;i++){
    	a[i] = (a[i-1] + ((i-1)*a[i-2])%1000000007)%1000000007;
    }
    scanf("%lld",&t);
    while(t--){
    	scanf("%lld",&n);
    	printf("%lld\n",a[n]);
    }
    return 0;
}
