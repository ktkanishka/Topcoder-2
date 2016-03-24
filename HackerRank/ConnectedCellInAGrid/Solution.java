package com.concellgrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	static int visited[][] = new int[10][10];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m, n;
		int a[][] = new int[10][10];

		m = Integer.parseInt(reader.readLine());
		n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				visited[i][j] = 0;
			}
		}

		for (int i = 0; i < m; i++) {
			String[] inp = reader.readLine().split(" ");
			for (int j = 0; j < inp.length; j++) {
				a[i][j] = Integer.parseInt(inp[j]);
			}
		}

		System.out.println(findLargestConnected(m, n, a, visited));

	}

	public static int findLargestConnected(int m, int n, int[][] matrix, int[][] visited) {
		int max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 1 && visited[i][j] == 0) {
					int count = visit(i, j, m, n, matrix, visited);
					if (count > max) {
						max = count;
					}
				}
			}
		}
		return max;
	}

	public static int visit(int x, int y, int width, int height, int[][] matrix, int[][] visited) {
		visited[x][y] = 1;
		int count = 1;
		if (isInBounds(x + 1, y, width, height) && visited[x + 1][y] == 0 && matrix[x + 1][y] == 1) {
			count +=  visit(x + 1, y, width, height, matrix, visited);
		}

		if (isInBounds(x - 1, y, width, height) && visited[x - 1][y] == 0 && matrix[x - 1][y] == 1) {
			count +=  visit(x - 1, y, width, height, matrix, visited);
		}

		if (isInBounds(x, y + 1, width, height) && visited[x][y + 1] == 0 && matrix[x][y + 1] == 1) {
			count +=  visit(x, y + 1, width, height, matrix, visited);
		}

		if (isInBounds(x, y - 1, width, height) && visited[x][y - 1] == 0 && matrix[x][y - 1] == 1) {
			count +=  visit(x, y - 1, width, height, matrix, visited);
		}

		if (isInBounds(x + 1, y + 1, width, height) && visited[x + 1][y + 1] == 0 && matrix[x + 1][y + 1] == 1) {
			count +=  visit(x + 1, y + 1, width, height, matrix, visited);
		}

		if (isInBounds(x + 1, y - 1, width, height) && visited[x + 1][y - 1] == 0 && matrix[x + 1][y - 1] == 1) {
			count +=  visit(x + 1, y - 1, width, height, matrix, visited);
		}

		if (isInBounds(x - 1, y + 1, width, height) && visited[x - 1][y + 1] == 0 && matrix[x - 1][y + 1] == 1) {
			count +=  visit(x - 1, y + 1, width, height, matrix, visited);
		}

		if (isInBounds(x - 1, y - 1, width, height) && visited[x - 1][y - 1] == 0 && matrix[x - 1][y - 1] == 1) {
			count += visit(x - 1, y - 1, width, height, matrix, visited);
		}

		return count;
	}

	public static boolean isInBounds(int x, int y, int m, int n) {
		if (x < 0 || x >= m)
			return false;

		if (y < 0 || y >= n)
			return false;

		return true;
	}

}
