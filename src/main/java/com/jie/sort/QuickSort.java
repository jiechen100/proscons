package com.jie.sort;

public class QuickSort {
	public void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int p = partition(a, low, high);
			quickSort(a, low, p - 1);
			quickSort(a, p + 1, high);
		}
	}

	private int median3(int[] a, int low, int high) {
		int i = (low + high) / 2;
		if (a[low] < a[high]) {
			if (a[i] < a[low]) {
				return low;
			}
			if (a[i] > a[high]) {
				return high;
			}

			return i;

		} else {
			// high,low
			if (a[i] < a[high]) {
				return high;
			}
			if (a[i] > a[low]) {
				return low;
			}

			return i;
		}
	}

	private int partition(int[] a, int low, int high) {
		int m = median3(a, low, high);
		if (m != low) {
			int x = a[low];
			a[low] = a[m];
			a[m] = x;
		}
		int val = a[low];
		int i = low + 1;
		int j = high;

		while (true) {
			// <= is because val=a[low]
			while (i <= high && a[i] <= val) {
				i++;
			}

			while (a[j] > val) {
				j--;
			}

			if (i < j) {
				int x = a[i];
				a[i] = a[j];
				a[j] = x;
			} else {
				a[low] = a[j];
				a[j] = val;
				return j;
			}
		}
	}
}
