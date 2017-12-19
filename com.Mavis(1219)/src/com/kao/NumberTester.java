package com.kao;

public class NumberTester {
	public static void main(String[] args) {
		int m = 100;
		for (int n = 1; n < m; n++) {
			if (n % 3 == 0) {
				System.out.print(n + "\t");
			}
		}
	}
}
