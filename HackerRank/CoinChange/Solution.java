import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/coin-change

public class Solution {
	
	static long[][] dp = new long[300][300];
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n,m;
		String in[];
		in = reader.readLine().split(" ");
		n = Integer.parseInt(in[0]);
		m = Integer.parseInt(in[1]);
		
		int[] s = new int[100];
		
		in = reader.readLine().split(" ");
		
		for(int i=0;i<in.length;i++){
			s[i] = Integer.parseInt(in[i]);
		}
		// Passing 'm' as an index to array. Hence decrementing it. 
		System.out.println(calcualteMinChange(s, n, m));
		
	}
	
	private static long calcualteMinChange(int[] s,int n,int m){
		for(int i=0; i<m;i++){
			dp[0][i] = 1L;
		}
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<m;j++){
				// Include coin 'j'
				long x = (i-s[j] >= 0)? dp[i-s[j]][j]:0L;
				// Dont include coin 'j'
			    long y = (j-1 >= 0)?dp[i][j-1] : 0L;
			    dp[i][j] = x + y;
			}
		}
		return dp[n][m-1];
	}
	
}
