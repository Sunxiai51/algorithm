package com.sunveee.algorithm.nowcoder;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * 
 * @author 51Sun
 *
 */
public class 斐波那契数列 {
	public static int Fibonacci(int n) {
		int[] f = new int[40];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

}
