package mylearning;

public class Arrays {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		creatingArray(arr);
		insertionInArray(arr,0,4);
		insertionInArray(arr,4,0);
		insertionInArray(arr,1,9);
		insertionInArray(arr,0,4);
		traverseInArray(arr);
		deletionInArray(arr,1);
		traverseInArray(arr);
		
		

	}

	public static void creatingArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public static void insertionInArray(int arr[], int location, int value) {
		if(arr[location]==Integer.MIN_VALUE) {
			arr[location] = value;
		} else {
			System.out.println("location is already full");
		}
	}
	
	public static void traverseInArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void deletionInArray(int arr[], int indexToBeDeleted) {
		if(arr[indexToBeDeleted]!=Integer.MIN_VALUE) {
			arr[indexToBeDeleted] = Integer.MIN_VALUE;
		} else {
			System.out.println("Value not present in the given index");
		}
	}
}
