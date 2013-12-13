class ShorterSuperSum {
public:
int calculate(int k, int n) {

if(k==0)
return n;
else
if(n==0)
return 0;
else
return calculate(k-1,n) + calculate(k,n-1);
}


};
