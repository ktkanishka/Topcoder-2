#include<vector>
#include<string>
using namespace std;
class LittleElephantAndDouble {

public: string getAnswer(vector <int> A) {
vector<int> temp;
int i;
for(i=0;i<A.size();i++) {
while(A[i]%2 == 0)
A[i] = A[i]/2;
}

int element = A[0];
int flag = 0;
for(i=1;i<A.size();i++){
if(A[i]!=element)
{
flag = 1;
break;
}
}
if(flag == 0)
return "YES";
else 
return "NO";


}


};
