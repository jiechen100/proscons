package com.jie.misc;

public class ExamQuestion7 {
	static int j;

	static void methodA(int i) {
		boolean b;
		do {
			b = i < 10 | methodB(4); /* Line 9 */
			b = i < 10 || methodB(8); // i<10 and || so that methodB not called
		} while (!b);
	}

	static boolean methodB(int i) {
		j += i;
		return true;
	}

	public static void main(String[] args) {
		methodA(0);
		System.out.println("j = " + j);
	}
}