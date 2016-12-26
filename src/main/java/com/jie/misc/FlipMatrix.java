package com.jie.misc;
public class FlipMatrix {
	static int xDim = 3;
	static int yDim = 4;
	static int[][] matrix = new int[xDim][yDim];
	static int[][] matrixFlipped = new int[yDim][xDim];

	public static void main(String[] args) {

		init();
		print(matrix);
		flip();
		print(matrixFlipped);

	}

	static void init() {
		for (int i = 0; i < xDim; i++) {
			for (int j = 0; j < yDim; j++) {
				matrix[i][j] = i * yDim + j;
			}
		}
	}

	static void flip() {
		for (int i = 0; i < xDim; i++) {
			for (int j = 0; j < yDim; j++) {
				matrixFlipped[j][i] = matrix[i][j];
			}
		}
	}

	static void print(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		System.out.println("---------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j]);
				if (j == cols - 1) {
					System.out.println();
				} else {
					System.out.print("|");
				}
			}
		}
	}

}
