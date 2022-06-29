package telran.multiarray.tools;

public class Matrix {
	public static int sum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static int[][] transp(int[][] matrix) {
		int[][] res = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				res[j][i] = matrix[i][j];
			}
		}
		return res;
	}
	
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int[][] res = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				int temp = 0;
				for (int k = 0; k < matrix2.length; k++) {
					int el = matrix1[i][k] * matrix2[k][j];
					temp += el;
				}
				res[i][j] = temp;
			}
		}
		return res;
	}
}
