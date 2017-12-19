package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		for(int n = 1; n <= 10; n++){
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		int n4 = r.nextInt(6)+1;
			System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		}
	}
}