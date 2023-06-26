package mylearning;

public class SortSquaresOfSortedArray {

	public static void main(String[] args) {
		int[] arr = {-5,-3,-1,0,2,4,5,6};
		sortSquaresOfSortedArray(arr);

	}
	
	public static void sortSquaresOfSortedArray(int[] arr) {
		int[] sqrarr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			sqrarr[i] = arr[i]*arr[i];
		}
		
	}

}
