package mylearning;

public class DynamicProgrammingProblem {

	public static void main(String[] args) {
		int n = 6;
		int arr[] = new int[n+1];
		System.out.println(fibonacci(n,arr));

	}
	
	
	public static int fibonacci(int n, int arr[]) {
		if(n<=1) return arr[n] = n;
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		if(arr[n-1]!=Integer.MIN_VALUE) return arr[n];
		
		int f1 = fibonacci(n-1,arr);
		int f2 = fibonacci(n-2,arr);
		
		return arr[n] = f1+f2;
		
	}

}
