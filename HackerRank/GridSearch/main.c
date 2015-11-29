//https://www.hackerrank.com/challenges/the-grid-search
// A Naive string brute force algorithm. Not even sure how it passed the cases without timing out.

#include<stdio.h>
int a[1005][1005];
int b[1005][1005];

int main() {
	int t, i, j, k, l;
	int r1, c1, r2, c2;
	char inp[1005];
	int globalFlag = 0;
	int flag = 0;
	scanf("%d", &t);
	while (t--) {
		globalFlag = 0;
		for (i = 0; i < 1000; i++) {
			for (j = 0; j < 1000; j++) {
				a[i][j] = 0;
				b[i][j] = 0;
			}
			inp[i] = '0';
		}
		scanf("%d%d", &r1, &c1);
		for (i = 0; i < r1; i++) {
			scanf("%s", inp);
			for (j = 0; j < c1; j++) {
				a[i][j] = inp[j] - '0';
			}
		}

		scanf("%d%d", &r2, &c2);
		for (i = 0; i < r2; i++) {
			scanf("%s", inp);
			for (j = 0; j < c2; j++) {
				b[i][j] = inp[j] - '0';
			}
		}

		if (r2 > r1 || c2 > c1) {
			printf("NO\n");
			continue;
		}

		for (i = 0; i < r1 - r2 + 1; i++) {
			for (j = 0; j < c1 - c2 + 1; j++) {
				flag = 0;

				for (k = 0; k < r2; k++) {
					for (l = 0; l < c2; l++) {
						if (b[k][l] != a[i+k][j+l]) {
							flag = 1;
							break;
						}
					}
					if (flag == 1) {
						break;
					}
				}

				if (flag == 0) {
					globalFlag = 1;
					break;
				}
			}
			if (globalFlag == 1) {
				break;
			}
		}
		if (globalFlag == 1) {
			printf("YES\n");
		} else {
			printf("NO\n");
		}
	}
	return 0;
}
