#include<vector>
#include<algorithm>
using namespace std;
 
class SRMCards {
  public:
    int maxTurns(vector < int >cards) {
	int i, run, count;
	 run = 1;
	 count = 0;
 
	//Sort the list to count the runs
	 sort(cards.begin(), cards.end());
 
	//for Even runs, can take out a maximum of runlength/2 times
	//for Odd runs, can take out a maximum of runlength/2 + 1 times
	for (i = 1; i < cards.size(); i++) {
	    if (cards[i] - cards[i - 1] == 1)
		run++;
	    else {
		if (run % 2 == 0)
		    count = count + run / 2;
		else
		    count = count + (run / 2) + 1;
		run = 1;
	}} if (run % 2 == 0)
	    count = count + run / 2;
	else
	    count = count + (run / 2) + 1;
 
 
	return count;
    }
 
};
