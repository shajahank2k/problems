package mylearning;

public class RotateImageProblem {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//rotateImageBruteForce(matrix);
		rotateImageOptimal(matrix);
		for(int[] arr : matrix) {
			for(int ans : arr) {
				System.out.print(ans+" ");
			}
			System.out.println();
		}

	}
	
	public static void rotateImageBruteForce(int[][] matrix) {//3*3 matrix
		for(int i=0;i<matrix.length-1;i++) {
			int top = matrix[0][i];
			matrix[0][i] = matrix[matrix.length-1-i][0];
			matrix[matrix.length-1-i][0] = matrix[matrix.length-1][matrix.length-1-i];
			matrix[matrix.length-1][matrix.length-1-i] = matrix[i][matrix.length-1];
			matrix[i][matrix.length-1] = top;
		}
		
	}
	
	public static void rotateImageOptimal(int[][] matrix) {//n*n matrix
		for(int outer = 0; outer<matrix.length/2;outer++) {
			int last = matrix.length-1-outer;
			for(int i=outer;i<last;i++) {
				int top = matrix[outer][i];
				matrix[outer][i] = matrix[last-i+outer][outer];
				matrix[last-i+outer][outer] = matrix[last][last-i+outer];
				matrix[last][last-i+outer] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		
	}

}
