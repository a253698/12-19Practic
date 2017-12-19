package com.ibm;

public class NineLazy2 {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int i = 2; i <= 9; i++) {
				if (n>3 && n<9) {
					System.out.print("  " + "..." + "\t");
				} else {
					System.out.print(i + "x" + n + "=" + (n * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}