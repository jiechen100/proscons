package com.jie.misc;

public class Expression {

	public static void main(String[] args) {
		int a = 5, b = 7;
		int c = a += 2 * 3 + b--;
		System.out.println(c);

		// if(a=b) not compiled
		if (a == b) {

		}

		int x = 11 & 9; // 1011 and 1001 = 1001 (9)
		int y = x ^ 3;// 1001 xor 0011 = 1010 (10)
		System.out.println(y | 12);// 1010 or 1100 = 1110 (14)

		System.out.println("boolean = "
				+ (new Boolean("TRUE") && new Boolean("true")
						&& new Boolean("TrUE") && new Boolean("tRue")));
	}

}
