public class NumberofFiboCalls {

	public int[] fiboCallsMade(int n) {
		int[][] calls = new int[50][2];
		
		
		calls = new int[50][2];
		
		calls[0][0] = 1;
		calls[0][1] = 0;
		
		calls[1][0] = 0;
		calls[1][1] = 1;
		
		
		for(int i=2;i<=n;i++){
			calls[i][0] = calls[i-1][0] + calls[i-2][0];
			calls[i][1] = calls[i-1][1] + calls[i-2][1];
		}
		
		int[] ans = new int[2];
		ans[0] = calls[n][0];
		ans[1] = calls[n][1];
		return ans;
	}

}
