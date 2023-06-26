package mylearning;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] nums = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		System.out.print(diagonalSumBruteForce(nums));

	}
	
	public static int diagonalSumBruteForce(int[][] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i == j) {
					sum += nums[i][j];
				} else if (i + j == nums.length - 1) {
					sum += nums[i][j];
				}
			}
		}
		return sum;
	}

}
