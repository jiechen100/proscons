package com.jie.misc;

import java.util.Random;

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

	public static void throwRuntimeExceptuionOKWithoutThrows() {
		throw new RuntimeException();
	}

	public static void throwExceptuionMustHaveThrows() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		

		Random r = new Random();
		int i = (int) r.nextFloat();
		int j = 0;
		switch (i) {
		case 0:
			j++;
		case 1:
			j = j + 2;
		default:
			j = 1;
		}

		System.out.println(Math.sqrt(-9));// NaN
		// not compiled
		// System.out.println(null);

		methodA(0);
		System.out.println("j = " + j);

	}
}