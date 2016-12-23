public class RotateMatrix {
	static int xDim = 3;
	static int yDim = 4;
	static int[][] matrix = new int[xDim][yDim];

	public static void main(String[] args) {

		init();
		print();
		rotate();
		print();

	}

	static void init() {
		int cnt = 0;
		for (int i = 0; i < xDim; i++) {
			for (int j = 0; j < yDim; j++) {
				matrix[i][j] = cnt++;
				// matrix[i][j]=i*yDim+j;
			}
		}
	}

	static void print() {
		System.out.println("---------------------");
		for (int i = 0; i < xDim; i++) {
			for (int j = 0; j < yDim; j++) {
				System.out.print(matrix[i][j]);
				if (j == yDim - 1) {
					System.out.println();
				} else {
					System.out.print("|");
				}
			}
		}
	}

}
