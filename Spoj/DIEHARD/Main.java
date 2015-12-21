import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[][][] dp = new int[1500][1500][3];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int t,h,a;
		t = Integer.parseInt(reader.readLine());
		while ((t--) > 0) {
			String[] in = reader.readLine().split(" ");
			h = Integer.parseInt(in[0]);
			a = Integer.parseInt(in[1]);
			System.out.println(solve(h+3, a+2, 0));
		}

	}
	
	static int solve(int h,int a,int p){
		if(h <= 0 || a <= 0){
			return 0;
		}
		
		if(dp[h][a][p] != 0){
			return dp[h][a][p];
		}
		
		//System.out.println(h + " " + a + " " + p);
		if(p == 0) {
			dp[h][a][0] = Math.max(solve(h-5,a-10,1)+1 , solve(h-20,a+5,2)+1);
			return dp[h][a][0];
		} else if(p == 1) {
			dp[h][a][1] = Math.max(solve(h+3,a+2,0)+1 , solve(h-20,a+5,2)+1); 
			return dp[h][a][1];
		} else {
			dp[h][a][2] = Math.max(solve(h+3,a+2,0)+1 , solve(h-5,a-10,1)+1); 
			return dp[h][a][2];
		}
	}

}
