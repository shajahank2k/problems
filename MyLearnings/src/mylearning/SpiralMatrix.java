package mylearning;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> answer = spiralMatrix(matrix);
		for(int ans : answer) {
			System.out.print(ans+" ");
		}

	}
	
	public static List<Integer> spiralMatrix(int[][] matrix){
		List<Integer> list = new ArrayList<>();
		
		return list;
	}

}
