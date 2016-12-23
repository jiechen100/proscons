package com.jie;

import java.util.Random;

import org.junit.Test;

import com.jie.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {
		Random r = new Random();
		int size = 20;
		int[] sorted = new int[size];
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			sorted[i] = i + 1;
			a[i] = sorted[i];
		}

		for (int i = 0; i < size * size; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			if (x != y) {
				int m = a[x];
				a[x] = a[y];
				a[y] = m;
			}
		}
		
		print(a);
		new QuickSort().quickSort(a, 0, a.length - 1);
		print(a);
	}

	void print(int[] a) {
		for (int v : a) {
			System.out.print(v);
			System.out.print(",");
		}
		System.out.println();
	}
}
