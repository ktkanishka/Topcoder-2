import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

	static double[][] dp = new double[1005][1005];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int x, y, n, w, p1, p2, t;
		t = Integer.parseInt(reader.readLine());
		while ((t--) > 0) {
			for (int i = 0; i < 1005; i++) {
				for (int j = 0; j < 1005; j++) {
					dp[i][j] = -1.0;
				}
			}
			String[] inp = reader.readLine().split(" ");
			x = Integer.parseInt(inp[0]);
			y = Integer.parseInt(inp[1]);
			n = Integer.parseInt(inp[2]);
			w = Integer.parseInt(inp[3]);
			p1 = Integer.parseInt(inp[4]);
			p2 = Integer.parseInt(inp[5]);
			System.out.println(String.format("%6f",
					solve(x, y, n, w, p1 / 100.0, p2 / 100.0) * 100));
		}

	}

	private static double solve(int x, int y, int n, int w, double p1, double p2) {

		if (w <= 0) {
			dp[0][n] = 1.0;
			return 1.0;
		} else if (n == 0) {
			dp[w][n] = 0.0;
			return 0.0;
		} else if (dp[w][n] >= 0) {
			return dp[w][n];
		} else {
			dp[w][n] = Math.max(
					(double) (solve(x, y, n - 1, w - x, p1, p2) * p1 + solve(x,
							y, n - 1, w, p1, p2) * (1.0 - p1)),
					(double) (solve(x, y, n - 1, w - y, p1, p2) * p2 + solve(x,
							y, n - 1, w, p1, p2) * (1.0 - p2)));
			return dp[w][n];
		}
	}

}
