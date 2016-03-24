package com.concellgrid;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

	@Test
	public void test1() {
		int mat[][] = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(0, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test2() {
		int mat[][] = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(1, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test3() {
		int mat[][] = new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(1, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test4() {
		int mat[][] = new int[][] { { 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(2, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test5() {
		int mat[][] = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(3, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test6() {
		int mat[][] = new int[][] { { 1, 0, 0 },
									{ 0, 1, 0 },
									{ 1, 0, 1 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(4, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test7() {
		int mat[][] = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(9, Solution.findLargestConnected(3, 3, mat, visited));
	}

	@Test
	public void test8() {
		int mat[][] = new int[][] { { 1 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(1, Solution.findLargestConnected(1, 1, mat, visited));
	}

	@Test
	public void test9() {
		int mat[][] = new int[][] { { 0 } };
		int visited[][] = new int[10][10];
		Assert.assertEquals(0, Solution.findLargestConnected(1, 1, mat, visited));
	}
	
	@Test
	public void testBounds1(){
		Assert.assertTrue(Solution.isInBounds(2, 0, 3, 3));
	}
	
	@Test
	public void testBounds2(){
		Assert.assertTrue(Solution.isInBounds(0, 0, 3, 3));
	}
	
	@Test
	public void testBounds3(){
		Assert.assertTrue(Solution.isInBounds(2, 2, 3, 3));
	}
	
	@Test
	public void testBounds4(){
		Assert.assertFalse(Solution.isInBounds(3, 0, 3, 3));
	}
	@Test
	public void testBounds5(){
		Assert.assertFalse(Solution.isInBounds(0, 3, 3, 3));
	}
	@Test
	public void testBounds6(){
		Assert.assertFalse(Solution.isInBounds(-1, 0, 3, 3));
	}
	@Test
	public void testBounds7(){
		Assert.assertFalse(Solution.isInBounds(0, -1, 3, 3));
	}

}
